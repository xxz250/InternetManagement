package com.chinatelecom.dao;

import java.awt.geom.Area;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinatelecom.dao.mapper.IpMapper;
import com.chinatelecom.model.Equipment_Ipaddress;
import com.chinatelecom.model.Ip;
import com.chinatelecom.model.IpMap;
import com.chinatelecom.model.ResPool;

@Repository
public class ipDao {
    @Autowired
    private IpMapper map;
    public List<Ip> getAllIp(){
    	return map.getAllIp();
    }
	public List<IpMap> getAllMap(){
		return map.getAllMap();
	}
	public List<ResPool> getAllResPool(){
		return map.getAllResPool();
	}
	public List<Area> getAllArea(){
		return map.getAllAreaByResPool();
	}
	public IpMap getIpMapByMapID(int mapID){
		return map.getIpMapByMapID(mapID);
	}
	public Ip getIpInfo(int ipID){
		return map.getIpInfo(ipID);
	}
	public List<Equipment_Ipaddress> getEquipIP(int EquipIPID){
		return map.getEquipIP(EquipIPID);
	}
}
