package com.chinatelecom.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chinatelecom.model.Ip;
import com.chinatelecom.model.IpMap;

@Service
public interface ipservice {
	public List<Ip> getAllIp();
	public List<IpMap> getAllMap();
	public IpMap getIpMapByMapID(int mapID);
	public List<Ip> getIpByEquipID(int equipmentID);
	public boolean IsOccupyOfIp(String ipAddr);
	public List<Ip> getAllIpByResPool(int resPoolID);
	public List<Ip> getAllIpByArea(int areaID);
}
