package com.chinatelecom.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chinatelecom.dao.equipmentDao;
import com.chinatelecom.model.Equipment;
import com.chinatelecom.model.EquipmentType;
import com.chinatelecom.model.Rack;
import com.chinatelecom.model.Room;
import com.chinatelecom.model.Site;
import com.chinatelecom.model.Vendor;
import com.chinatelecom.service.equipservice;

public class equipserviceimpl implements equipservice{
	
    @Autowired
    private equipmentDao getEquipInfo;
    
    @Override
	public List<Site> getAllSite(){
    	return getEquipInfo.getAllSite();
    }
    public List<Room> getAllRoom(){
    	return getEquipInfo.getAllRoom();
    }
    public List<Rack> getAllRack(){
    	return getEquipInfo.getAllRack();
    }
	public List<Room> getAllRoomBySite(int SiteID){
		return getEquipInfo.getAllRoomBySite(SiteID);
	}
	public List<Rack> getAllRackByRoom(int RoomID){
		return getEquipInfo.getAllRackByRoom(RoomID);
	}
	public List<Equipment> getAllEqulpmentByRack(int RackID){
		return getEquipInfo.getAllEqulpmentByRack(RackID);
	}
	public List<Vendor> getAllVendor(){
		return getEquipInfo.getAllVendor();
	}
	public List<EquipmentType> getAllEquipmentType(){
		return getEquipInfo.getAllEquipmentType();
	}
	public List<Rack> getAllRackBySiteID(int SiteID){
		List<Rack> rack = new ArrayList<Rack>();
		List<Room> roomList=getEquipInfo.getAllRoomBySite(SiteID);
		for(Room room:roomList){
			List<Rack> rackList=(getEquipInfo.getAllRackByRoom(room.getID()));
			rack.addAll(rackList);
		}
	/*	for(int i=0;i<roomList.size();i++){
			rack.add(getEquipInfo.getAllRackByRoom(roomList.get(i).getID()));
		}*/
		return rack;
	}
	public List<Equipment> getAllEquipBySiteID(int SiteID){
		List<Equipment> equip=new ArrayList<Equipment>();
		List<Room> roomList=getEquipInfo.getAllRoomBySite(SiteID);
		for(Room room:roomList){
			List<Rack> rackList=getEquipInfo.getAllRackByRoom(room.getID());
			for(Rack rack:rackList){
				List<Equipment> equipList=getEquipInfo.getAllEqulpmentByRack(rack.getID());
				equip.addAll(equipList);
			}
		}
		return equip;
	}
	public List<Equipment> getAllEquipmentByVendorID(int VendorID){
		List<Equipment> equip=new ArrayList<Equipment>();
		List<EquipmentType> typeList=getEquipInfo.getAllTypeByVendorID(VendorID);
		for(EquipmentType equipmenttype:typeList){
			List<Equipment> equipmentList=getEquipInfo.getAllEquipmentByType(equipmenttype.getTYPE());
			equip.addAll(equipmentList);
		}
		return equip;
	}
	public List<Equipment> getAllEquipByEquipType(int EquipType){
		return getEquipInfo.getAllEquipmentByType(EquipType);
	}
}

