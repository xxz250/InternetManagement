package com.chinatelecom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatelecom.constants.ReturnValue;
import com.chinatelecom.model.Ip;
import com.chinatelecom.model.IpMap;
import com.chinatelecom.model.ResPool;
import com.chinatelecom.service.ipservice;

@Controller
@RequestMapping("/allipinfo")
public class IpWebservice {
     
    @Autowired
    private ipservice ip;

    @RequestMapping("/getallipinfo")
    @ResponseBody
    public Object getAllIp(){
    	List<Ip> ipList=ip.getAllIp();
    	if(ipList.isEmpty()){
    		return ReturnValue.empty;
    	}
    	return ipList;
    }
	public Object getAllMap(){
		List<IpMap> ipmapList=ip.getAllMap();
		if(ipmapList.isEmpty()){
			return ReturnValue.empty;
		}
		return ipmapList;
	}
	public Object getAllResPool(){
		List<ResPool> respool=ip.getAllResPool();
		if(respool.isEmpty()){
			return ReturnValue.empty;
		}
		return respool;
	}
	public Object getIpMapByMapID(
			@RequestParam(value = "nameid",required = false) String id){
		IpMap ipmap=new IpMap();
		if(id!=""){
			int ID=Integer.parseInt(id);
			ipmap=ip.getIpMapByMapID(ID);
			if(ipmap==null){
				return ReturnValue.empty;
			}
		}
		else{
			return ReturnValue.error;
		}	
		return ipmap;
	}
	public Object getIpByEquipID(
			@RequestParam(value = "nameid",required = false) String id){
		List<Ip> ipList=new ArrayList<Ip>();
		if(id!=""){
			int ID=Integer.parseInt(id);
			ipList=ip.getIpByEquipID(ID);
			if(ipList.isEmpty()){
				return ReturnValue.empty;
			}
		}
		else{
			return ReturnValue.error;
		}
		return ipList;
	}
	public Object IsOccupyOfIp(
			@RequestParam(value = "nameid",required = false) String id,
			@RequestParam(value = "ipid",required = false) String ipaddr){
		if(id!=""&&ipaddr!=""){
			int ID=Integer.parseInt(id);
			List<Ip> ipList=ip.getAllIpByResPool(ID);
			for(Ip ipobject:ipList){
				if(ipaddr.equals(ipobject.getIP())){
					return true;
				}
			}
		}
		else{
			return ReturnValue.error;
		}
		return false;
	}
}
