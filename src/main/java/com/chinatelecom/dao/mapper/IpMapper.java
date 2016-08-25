package com.chinatelecom.dao.mapper;

import java.util.List;

import com.chinatelecom.model.Area;
import com.chinatelecom.model.Equipment_Ipaddress;
import com.chinatelecom.model.Ip;
import com.chinatelecom.model.IpMap;
import com.chinatelecom.model.IpSegment;
import com.chinatelecom.model.ResPool;

public interface IpMapper {
	public List<Ip> getAllIp();
	public List<IpMap> getAllMap();
	public IpMap getIpMapByMapID(int mapID);
	public Ip getIpInfo(int ipID);
	public List<Equipment_Ipaddress> getEquipIP(int EquipIPID);
	public List<ResPool> getAllResPool();
	public List<Area> getAllAreaByResPool(int PoolID);
	public List<IpSegment> getAllIpSegmentByArea(int AreaID);
	public List<Ip> getAllIpByIpSegment(int SegmentID);
}
