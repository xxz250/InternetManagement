package com.chinatelecom.dao.mapper;

import java.util.List;

import com.chinatelecom.model.Equipment;
import com.chinatelecom.model.Rack;
import com.chinatelecom.model.Room;
import com.chinatelecom.model.Site;
import com.chinatelecom.model.Vendor;

public interface EquipmentMapper {
	public int getSiteID(String SiteName);
	public int getRoomID(String RoomName);
	public int getRackID(int Columeid);
	public int getEquipmentID(String HostName);
	public Site getSiteInfoBySiteID(int SiteID);
	public List<String> getRoomNameBySiteID(int SiteID);
	public Room getRoomInfoByRoomID(int RoomID);
	public List<String> getRackSequenceByRoomID(int RoomID) ;
	public Rack getRackInfoByRackID(int Rack);
	public Vendor getVendorInfoByVendorID(int VendorID);
	public int getEquipTypeByVendorID(int VectorID);
	public List<String> getEquipNameByRoomID(int RoomID);
	public List<String> getEquipNameByRackID(int RackID);
	public List<String> getEquipNameByEquipTypeID(int EquipTypeID);
	public Equipment getEquipInfoByEquipID(int EquipID);
	public List<String> getIpNameByEquipID(int EquipID);
}
