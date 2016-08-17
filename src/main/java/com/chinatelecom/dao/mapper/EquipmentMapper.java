package com.chinatelecom.dao.mapper;

import java.util.List;

import com.chinatelecom.model.Equipment;
import com.chinatelecom.model.EquipmentType;
import com.chinatelecom.model.Rack;
import com.chinatelecom.model.Room;
import com.chinatelecom.model.Site;
import com.chinatelecom.model.Vendor;

public interface EquipmentMapper {
	public List<Site> getAllSite();
	public List<Room> getAllRoom();
	public List<Rack> getAllRack();
	public List<Room> getAllRoomBySite(int SiteID);
	public List<Rack> getAllRackByRoom(int RoomID);
	public List<Equipment> getAllEqulpmentByRack(int RackID);
	public List<Vendor> getAllVendor();
	public List<EquipmentType> getAllEquipmentType();
	public List<EquipmentType> getAllTypeByVendorID(int Vendor);
	public List<Equipment> getAllEquipmentByType(int Type);
}
