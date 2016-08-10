package com.chinatelecom.dao.mapper;

import java.util.List;

import com.chinatelecom.model.Site;

public interface EquipmentMapper {
	public int getSiteID(String SiteName);
	public int getRoomID(String RoomName);
	public int getRackID(int Columeid);
	public int getEquipmentID(String HostName);
	public List<Site> getSiteInfoBySiteID(int SiteID);
	public List<String> getRoomNameBySiteID(int SiteID);
	public String getRoomInfoByRoomID(int RoomID);
	public List<String> getRackSequenceByRoomID(int RoomID) ;
	public String getRackInfoByRackID(int Rack);
	public List<String> getVendorInfoByVectorID(int VectorID);
	public int getEquipTypeByVendorID(int VectorID);
	public List<String> getEquipNameByRoomID(int RoomID);
	public List<String> getEquipNameByRackID(int RackID);
	public List<String> getEquipNameByEquipTypeID(int EquipTypeID);
	public List<String> getEquipInfoByEquipID(int EquipID);
	public List<String> getIpNameByEquipID(int EquipID);
}
