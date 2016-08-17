package com.chinatelecom.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chinatelecom.dao.ipDao;
import com.chinatelecom.model.Equipment_Ipaddress;
import com.chinatelecom.model.Ip;
import com.chinatelecom.model.IpMap;
import com.chinatelecom.service.ipservice;

public class ipserviceimpl implements ipservice{

    @Autowired
    private ipDao ipInfo;
    
   // @Override
    public List<Ip> getAllIp(){
    	return ipInfo.getAllIp();
    }
	public List<IpMap> getAllMap(){
		return ipInfo.getAllMap();
	}
	public IpMap getIpMapByMapID(int mapID){
		return ipInfo.getIpMapByMapID(mapID);
	}
	public List<Ip> getIpByEquipID(int equipmentID){
		List<Equipment_Ipaddress> equipipLIst=ipInfo.getEquipIP(equipmentID);
		List<Ip> ip=new ArrayList<Ip>();
		for(Equipment_Ipaddress equipip:equipipLIst){
			ip.add(ipInfo.getIpInfo(equipip.getIPADDRESSID()));
		}
		return ip;
	}
	public boolean IsOccupyOfIp(String ipAddr){
		List<Ip> ipList=ipInfo.getAllIp();
		for(Ip ip:ipList){
			if(ipAddr.equals(ip.getIP())){
				return true;
			}
		}
		return false;
	}
	public List<Ip> getAllIpByResPool(int resPoolID){
		
	}
	public List<Ip> getAllIpByArea(int areaID){
		
	}
}
