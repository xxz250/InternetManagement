package com.chinatelecom.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatelecom.constants.ReturnValue;
import com.chinatelecom.model.Ip;
import com.chinatelecom.model.IpMap;
import com.chinatelecom.model.ResPool;
import com.chinatelecom.service.IpService;

@Controller
@RequestMapping("/ipManager")
public class IpWebservice {
     
    @Autowired
    private IpService ip;

    @RequestMapping("/getAllIp")
    @ResponseBody
    public Object getAllIp(){
    	List<Ip> ipList=ip.getAllIp();
    	if(ipList.isEmpty()){
    		return ReturnValue.empty;
    	}
    	return ipList;
    }
    @RequestMapping("/getAllMap")
    @ResponseBody
	public Object getAllMap(){
		List<IpMap> ipmapList=ip.getAllMap();
		if(ipmapList.isEmpty()){
			return ReturnValue.empty;
		}
		return ipmapList;
	}
    @RequestMapping("/getAllResPool")
    @ResponseBody
	public Object getAllResPool(){
		List<ResPool> respool=ip.getAllResPool();
		if(respool.isEmpty()){
			return ReturnValue.empty;
		}
		return respool;
	}
    @RequestMapping(value="/getIpMapByMapID",method=RequestMethod.POST)
    @ResponseBody
	public Object getIpMapByMapID(HttpServletRequest request,
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
    @RequestMapping(value="/getIpByEquipID",method=RequestMethod.POST)
    @ResponseBody
	public Object getIpByEquipID(HttpServletRequest request,
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
    @RequestMapping(value="/IsOccupyOfIp",method=RequestMethod.POST)
    @ResponseBody
	public Object IsOccupyOfIp(HttpServletRequest request,
			@RequestParam(value = "nameid",required = false) String id,
			@RequestParam(value = "param",required = false) String ipaddr){
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
