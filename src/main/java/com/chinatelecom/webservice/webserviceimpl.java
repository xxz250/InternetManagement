package com.chinatelecom.webservice;

import java.util.List;

import com.chinatelecom.dao.equipmentDao;
import com.chinatelecom.model.Equipment;
import com.chinatelecom.model.Rack;
import com.chinatelecom.model.Room;
import com.chinatelecom.model.Site;
import com.chinatelecom.model.Vendor;

public class webserviceimpl {
	
    private equipmentDao getEquipInfo;
    
    public Site getSiteInfoBySiteID(int SiteID){
        return getEquipInfo.getSiteInfoBySiteID(SiteID);
    }
    public List<String> getRoomNameBySiteID(int SiteID){
        return getEquipInfo.getRoomNameBySiteID(SiteID);
    }   
    public Room getRoomInfoByRoomID(int RoomID) {
        return getEquipInfo.getRoomInfoByRoomID(RoomID);
    }   
    public List<String> getRackSequenceByRoomID(int RoomID){
        return getEquipInfo.getRackSequenceByRoomID(RoomID);
    }   
    public Rack getRackInfoByRackID(int RackID){
        return getEquipInfo.getRackInfoByRackID(RackID);
    }   
    public Vendor getVendorInfoByVendorID(int VendorID){
        return getEquipInfo.getVendorInfoByVendorID(VendorID);
    }
    public int getEquipTypeByVendorID(int VendorID){
        return getEquipInfo.getEquipTypeByVendorID(VendorID);
    }
    public List<String> getEquipNameByRoomID(int RoomID){
        return getEquipInfo.getEquipNameByRoomID(RoomID);
    }
    public List<String> getEquipNameByRackID(int RackID){
        return getEquipInfo.getEquipNameByRackID(RackID);
    }
    public List<String> getEquipNameByEquipTypeID(int EquipTypeID){
        return getEquipInfo.getEquipNameByEquipTypeID(EquipTypeID);
    }
    public Equipment getEquipInfoByEquipID(int EquipID){
        return getEquipInfo.getEquipInfoByEquipID(EquipID);
    }
    public List<String> getIpNameByEquipID(int EquipID){
        return getEquipInfo.getIpNameByEquipID(EquipID);
    }
}

