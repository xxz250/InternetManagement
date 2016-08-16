package com.chinatelecom.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chinatelecom.model.Equipment;
import com.chinatelecom.model.EquipmentType;
import com.chinatelecom.model.Rack;
import com.chinatelecom.model.Room;
import com.chinatelecom.model.Site;
import com.chinatelecom.model.Vendor;

@Service
public interface equipservice {
	public List<Site> getAllSite();
	public List<Room> getAllRoomBySite(int SiteID);
	public List<Rack> getAllRackByRoom(int RoomID);
	public List<Equipment> getAllEqulpmentByRack(int RackID);
	public List<Vendor> getAllVendor();
	public List<EquipmentType> getAllEquipmentType(); 
	public List<Equipment> getAllEquipmentByVendorID(int VendorID); 
	public List<Equipment> getAllEquipByEquipType(int EquipType);
	public List<Rack> getAllRackBySiteID(int SiteID);
	public List<Equipment> getAllEquipBySiteID(int SiteID);
}
