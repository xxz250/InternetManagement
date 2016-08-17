package com.chinatelecom.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinatelecom.dao.mapper.EquipmentMapper;
import com.chinatelecom.model.Equipment;
import com.chinatelecom.model.EquipmentType;
import com.chinatelecom.model.Rack;
import com.chinatelecom.model.Room;
import com.chinatelecom.model.Site;
import com.chinatelecom.model.Vendor;

@Repository
public class equipmentDao {
    @Autowired
    public EquipmentMapper mapper;

    public List<Site> getAllSite(){
    	return mapper.getAllSite();
    }
    public List<Room> getAllRoom(){
    	return mapper.getAllRoom();
    }
    public List<Rack> getAllRack(){
    	return mapper.getAllRack();
    }
	public List<Room> getAllRoomBySite(int SiteID){
		return mapper.getAllRoomBySite(SiteID);
	}
	public List<Rack> getAllRackByRoom(int RoomID){
		return mapper.getAllRackByRoom(RoomID);
	}
	public List<Equipment> getAllEqulpmentByRack(int RackID){
		return mapper.getAllEqulpmentByRack(RackID);
	}
	public List<Vendor> getAllVendor(){
		return mapper.getAllVendor();
	}
	public List<EquipmentType> getAllEquipmentType(){
		return mapper.getAllEquipmentType();
	}  
	public List<EquipmentType> getAllTypeByVendorID(int Vendor){
		return mapper.getAllTypeByVendorID(Vendor);
	}
	public List<Equipment> getAllEquipmentByType(int Type){
		return mapper.getAllEquipmentByType(Type);
	}
}