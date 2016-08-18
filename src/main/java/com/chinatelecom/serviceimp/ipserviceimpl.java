package com.chinatelecom.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chinatelecom.dao.ipDao;
import com.chinatelecom.model.Area;
import com.chinatelecom.model.Equipment_Ipaddress;
import com.chinatelecom.model.Ip;
import com.chinatelecom.model.IpMap;
import com.chinatelecom.model.IpSegment;
import com.chinatelecom.model.ResPool;
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
	public List<ResPool> getAllResPool(){
		return ipInfo.getAllResPool();
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
	public List<Ip> getAllIpByResPool(int resPoolID){
		List<Area> areaList=ipInfo.getAllAreaByResPool(resPoolID);
		List<Ip> ip=new ArrayList<Ip>();
		for(Area area:areaList){
			List<IpSegment> segmentList=ipInfo.getAllIpSegmentByArea(area.getID());
			for(IpSegment segment:segmentList){
				List<Ip> ipList=ipInfo.getAllIpByIpSegment(segment.getID());
				ipList.addAll(ipList);
			}
		}
		return ip;
	}
}
