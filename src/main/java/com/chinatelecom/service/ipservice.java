package com.chinatelecom.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chinatelecom.model.Ip;
import com.chinatelecom.model.IpMap;
import com.chinatelecom.model.ResPool;

@Service
public interface ipservice {
	public List<Ip> getAllIp();
	public List<IpMap> getAllMap();
	public List<ResPool> getAllResPool();
	public IpMap getIpMapByMapID(int mapID);
	public List<Ip> getIpByEquipID(int equipmentID);
	public List<Ip> getAllIpByResPool(int resPoolID);
}
