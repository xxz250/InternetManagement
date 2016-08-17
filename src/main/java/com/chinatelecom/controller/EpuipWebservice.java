package com.chinatelecom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatelecom.model.Equipment;
import com.chinatelecom.model.EquipmentType;
import com.chinatelecom.model.Rack;
import com.chinatelecom.model.Room;
import com.chinatelecom.model.Site;
import com.chinatelecom.model.Vendor;
import com.chinatelecom.service.equipservice;

@Controller
@RequestMapping("/allepuipinfo")
public class EpuipWebservice {

    @Autowired
    private equipservice equip;

    @RequestMapping("/getallepuipinfo")
    @ResponseBody
    /*public Object getAllSite(){
    	List<Site> site=equip.getAllSite();
    	if(site.isEmpty()){
    		return "no information";
    	}
    	return site;
    }
    public Object getAllRoom(){
    	List<Room> room=equip.getAllRoom();
    	if(room.isEmpty()){
    		return "no information";
    	}
    	return room;
    }
    public Object getAllRack(){
    	List<Rack> rack=equip.getAllRack();
    	if(rack.isEmpty()){
    		return "no information";
    	}
    	return rack;
    }
    public Object getAllRoomBySite(
            @RequestParam(value = "nameid", required = false) String id) {
    	List<Room> room = new ArrayList<Room>(); 
    	if(id!=""){
    		int ID = Integer.parseInt(id);
            room = equip.getAllRoomBySite(ID);
            if(room.isEmpty()){
                return "no information";
            }
    	}
    	else{
    		return "context can not be null";
    	}
    	return room;
    } 
    public Object getAllRackByRoom(
    		@RequestParam(value = "nameid", required = false) String id){
    	List<Rack> rack=new ArrayList<Rack>();
    	if(id!=""){
    		int ID=Integer.parseInt(id);
    		rack=equip.getAllRackByRoom(ID);
    		if(rack.isEmpty()){
    			return "no information";
    		}
    	}
    	else{
    		return "context can not be null";
    	}
    	return rack;
    }
    public Object getAllEqulpmentByRack(
    		@RequestParam(value = "nameid", required = false) String id){
    	List<Equipment> equipment=new ArrayList<Equipment>();
    	if(id!=""){
    		int ID=Integer.parseInt(id);
    		equipment=equip.getAllEqulpmentByRack(ID);
    		if(equipment.isEmpty()){
    			return "no information";
    		}
    	}
    	else{
    		return "context can not be null";
    	}
    	return equipment;	
    }
    public Object getAllVendor(){
    	List<Vendor> vendor=new ArrayList<Vendor>();
    	vendor=equip.getAllVendor();
    	if(vendor.isEmpty()){
    		return "no information";
    	}
    	return vendor;
    }
    public Object getAllEquipmentType(){
    	List<EquipmentType> type=new ArrayList<EquipmentType>();
    	type=equip.getAllEquipmentType();
    	if(type.isEmpty()){
    		return "no information";
    	}
    	return type;
    }*/
    public Object getAllEquipmentByVendorID(
    		@RequestParam(value = "nameid", required = false) String id){
    	List<Equipment> equipment=new ArrayList<Equipment>();
    	if(id!=""){
    		int ID=Integer.parseInt(id);
    		equipment=equip.getAllEquipmentByVendorID(ID);
    		if(equipment.isEmpty()){
    			return "no information";
    		}
    	}
    	else{
    		return "context can not be null";
    	}
    	return equipment;
    }
   /* public Object getAllEquipByEquipType(
    		@RequestParam(value = "nameid", required = false) String id){
    	List<Equipment> equipment=new ArrayList<Equipment>();
    	if(id!=""){
    		int ID=Integer.parseInt(id);
    		equipment=equip.getAllEquipByEquipType(ID);
    		if(equipment.isEmpty()){
    			return "no information";
    		}
    	}
    	else{
    		return "context can not be null";
    	}
    	return equipment;
    }
    public Object getAllRackBySiteID(
    		@RequestParam(value = "nameid", required = false) String id){
    	List<Rack> rack=new ArrayList<Rack>();
    	if(id!=""){
    		int ID=Integer.parseInt(id);
    		rack=equip.getAllRackBySiteID(ID);
    		if(rack.isEmpty()){
    			return "no information";
    		}
    	}
    	else{
    		return "context can not be null";
    	}
    	return rack;
    }
    public Object getAllEquipBySiteID(
    		@RequestParam(value = "nameid", required = false) String id){
    	List<Equipment> equipment=new ArrayList<Equipment>();
    	if(id!=""){
    		int ID=Integer.parseInt(id);
    		equipment=equip.getAllEquipBySiteID(ID);
    		if(equipment.isEmpty()){
    			return "no information";
    		}
    	}
    	else{
    		return "context can not be null";
    	}
    	return equipment;
    }*/
}
