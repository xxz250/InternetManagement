package com.chinatelecom.service;

import org.springframework.stereotype.Service;

@Service
public interface FunctionChoice {
	public void isLogin(String num,String name,String passwd);
	public void quit();
	public void getAllSite();
	public void getAllRoom();
	public void getAllRack();
	public void getAllVendor();
	public void getAllEquipmentType();
	public void getAllRoomBySite(String id);
	public void getAllEqulpmentByRack(String id);
	public void getAllRackByRoom(String id);
	public void getAllRackBySiteID(String id);
	public void getAllEquipBySiteID(String id);
	public void getAllEquipByEquipType(String id);
	public void getAllEquipmentByVendorID(String id);
	public void getAllIp();
	public void getAllMap();
	public void getAllResPool();
	public void getIpByEquipID(String id);
	public void getIpMapByMapID(String id);
	public void IsOccupyOfIp(String num,String id,String ipaddr); 
}
