package com.chinatelecom.dao;

import java.util.List;

import com.chinatelecom.dao.mapper.EquipmentMapper;
import com.chinatelecom.model.Equipment;
import com.chinatelecom.model.Rack;
import com.chinatelecom.model.Room;
import com.chinatelecom.model.Site;
import com.chinatelecom.model.Vendor;


public class equipmentDao {
	public EquipmentMapper mapper;
	public Site getSiteInfoBySiteID(int SiteID){
		/*int ID = mapper.getID(SiteNanme);
		return mapper.getSiteInfoBySiteID(ID);*/
		Site siteinfo=mapper.getSiteInfoBySiteID(SiteID);
		if(siteinfo==null){
			return null;
		}
		else {
			return siteinfo;
		}
	}
	
	public List<String> getRoomNameBySiteID(int SiteID){
		List<String> roomname=mapper.getRoomNameBySiteID(SiteID);
		if(roomname.isEmpty()){
			return null;
		}
		else{
			return roomname;
		}
	}
	
	public Room getRoomInfoByRoomID(int RoomID) {
		Room roominfo=mapper.getRoomInfoByRoomID(RoomID);
		if(roominfo==null){
			return null;
		}
		else{
			return roominfo;
		}
	}
	
	public List<String> getRackSequenceByRoomID(int RoomID){
		List<String> racksequence=mapper.getRackSequenceByRoomID(RoomID);
		if(racksequence.isEmpty()){
			return null;
		}
		return racksequence;
	}
	
	public Rack getRackInfoByRackID(int RackID){
		Rack rackinfo=mapper.getRackInfoByRackID(RackID);
		if(rackinfo==null){
			return null;
		}
		else{
			return rackinfo;
		}
	}
	
	public Vendor getVendorInfoByVendorID(int VendorID){
		Vendor vendorinfo=mapper.getVendorInfoByVendorID(VendorID);
		if(vendorinfo==null){
			return null;
		}
		else {
			return vendorinfo;
		}
	}
	
	public int getEquipTypeByVendorID(int VectorID){
		int type=mapper.getEquipTypeByVendorID(VectorID);
		if(type<0){
			return -1;
		}
		else{
			return type;
		}
	}
	public List<String> getEquipNameByRoomID(int RoomID){
		List<String> equipname = mapper.getEquipNameByRoomID(RoomID);
		if(equipname.isEmpty()){
			return null;
		}
		else{
			return equipname;
		}
	}
	public List<String> getEquipNameByRackID(int RackID){
		List<String> equipname = mapper.getEquipNameByRackID(RackID);
		if(equipname.isEmpty()){
			return null;
		}
		else{
			return equipname;
		}
	}
	public List<String> getEquipNameByEquipTypeID(int EquipTypeID){
		List<String> equipname = mapper.getEquipNameByEquipTypeID(EquipTypeID);
		if(equipname.isEmpty()){
			return null;
		}
		else{
			return equipname;
		}
	}
	public Equipment getEquipInfoByEquipID(int EquipID){
		Equipment equipinfo = mapper.getEquipInfoByEquipID(EquipID);
		if(equipinfo==null){
			return null;
		}
		else{
			return equipinfo;
		}
	}
	public List<String> getIpNameByEquipID(int EquipID){
		List<String> ipname = mapper.getIpNameByEquipID(EquipID);
		if(ipname.isEmpty()){
			return null;
		}
		else{
			return ipname;
		}
	}
}
