package com.chinatelecom.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatelecom.constants.ReturnValue;
import com.chinatelecom.model.Equipment;
import com.chinatelecom.model.EquipmentType;
import com.chinatelecom.model.Rack;
import com.chinatelecom.model.Room;
import com.chinatelecom.model.Site;
import com.chinatelecom.model.Vendor;
import com.chinatelecom.service.EquipmentService;

@Controller
@RequestMapping("/equipManager")
public class EpuipWebservice {

    @Autowired
    private EquipmentService equip;

    @RequestMapping("/getAllSite")
    @ResponseBody
    public Object getAllSite(){
    	List<Site> site=equip.getAllSite();
    	if(site.isEmpty()){
    		return ReturnValue.empty;
    	}
    	return site;
    }
    @RequestMapping("/getAllRoom")
    @ResponseBody
    public Object getAllRoom(){
    	List<Room> room=equip.getAllRoom();
    	if(room.isEmpty()){
    		return ReturnValue.empty;
    	}
    	return room;
    }
    @RequestMapping("/getAllRack")
    @ResponseBody
    public Object getAllRack(){
    	List<Rack> rack=equip.getAllRack();
    	if(rack.isEmpty()){
    		return ReturnValue.empty;
    	}
    	return rack;
    }
    @RequestMapping(value="/getAllRoomBySite",method=RequestMethod.POST)
    @ResponseBody
    public Object getAllRoomBySite(HttpServletRequest request,
            @RequestParam(value = "nameid", required = false) String id) {
    	List<Room> room = new ArrayList<Room>(); 
    	if(id!=""){
    		int ID = Integer.parseInt(id);
            room = equip.getAllRoomBySite(ID);
            if(room.isEmpty()){
                return ReturnValue.empty;
            }
    	}
    	else{
    		return ReturnValue.error;
    	}
    	return room;
    }
    @RequestMapping(value="/getAllRackByRoom",method=RequestMethod.POST)
    @ResponseBody
    public Object getAllRackByRoom(HttpServletRequest request,
    		@RequestParam(value = "nameid", required = false) String id){
    	List<Rack> rack=new ArrayList<Rack>();
    	if(id!=""){
    		int ID=Integer.parseInt(id);
    		rack=equip.getAllRackByRoom(ID);
    		if(rack.isEmpty()){
    			return ReturnValue.empty;
    		}
    	}
    	else{
    		return ReturnValue.error;
    	}
    	return rack;
    }
    @RequestMapping(value="/getAllEqulpmentByRack",method=RequestMethod.POST)
    @ResponseBody
    public Object getAllEqulpmentByRack(HttpServletRequest request,
    		@RequestParam(value = "nameid", required = false) String id){
    	List<Equipment> equipment=new ArrayList<Equipment>();
    	if(id!=""){
    		int ID=Integer.parseInt(id);
    		equipment=equip.getAllEqulpmentByRack(ID);
    		if(equipment.isEmpty()){
    			return ReturnValue.empty;
    		}
    	}
    	else{
    		return ReturnValue.error;
    	}
    	return equipment;	
    }
    @RequestMapping("/getAllVendor")
    @ResponseBody
    public Object getAllVendor(){
    	List<Vendor> vendor=new ArrayList<Vendor>();
    	vendor=equip.getAllVendor();
    	if(vendor.isEmpty()){
    		return ReturnValue.empty;
    	}
    	return vendor;
    }
    @RequestMapping("/getAllEquipmentType")
    @ResponseBody
    public Object getAllEquipmentType(){
    	List<EquipmentType> type=new ArrayList<EquipmentType>();
    	type=equip.getAllEquipmentType();
    	if(type.isEmpty()){
    		return ReturnValue.empty;
    	}
    	return type;
    }
    @RequestMapping(value="/getAllEquipmentByVendorID",method=RequestMethod.POST)
    @ResponseBody
    public Object getAllEquipmentByVendorID(HttpServletRequest request,
    		@RequestParam(value = "nameid", required = false) String id){
    	List<Equipment> equipment=new ArrayList<Equipment>();
    	if(id!=""){
    		int ID=Integer.parseInt(id);
    		equipment=equip.getAllEquipmentByVendorID(ID);
    		if(equipment.isEmpty()){
    			return ReturnValue.empty;
    		}
    	}
    	else{
    		return ReturnValue.error;
    	}
    	return equipment;
    }
    @RequestMapping(value="/getAllEquipByEquipType",method=RequestMethod.POST)
    @ResponseBody
    public Object getAllEquipByEquipType(HttpServletRequest request,
    		@RequestParam(value = "nameid", required = false) String id){
    	List<Equipment> equipment=new ArrayList<Equipment>();
    	if(id!=""){
    		int ID=Integer.parseInt(id);
    		equipment=equip.getAllEquipByEquipType(ID);
    		if(equipment.isEmpty()){
    			return ReturnValue.empty;
    		}
    	}
    	else{
    		return ReturnValue.error;
    	}
    	return equipment;
    }
    @RequestMapping(value="/getAllRackBySiteID",method=RequestMethod.POST)
    @ResponseBody
    public Object getAllRackBySiteID(HttpServletRequest request,
    		@RequestParam(value = "nameid", required = false) String id){
    	List<Rack> rack=new ArrayList<Rack>();
    	if(id!=""){
    		int ID=Integer.parseInt(id);
    		rack=equip.getAllRackBySiteID(ID);
    		if(rack.isEmpty()){
    			return ReturnValue.empty;
    		}
    	}
    	else{
    		return ReturnValue.error;
    	}
    	return rack;
    }
    @RequestMapping(value="/getAllEquipBySiteID",method=RequestMethod.POST)
    @ResponseBody
    public Object getAllEquipBySiteID(HttpServletRequest request,
    		@RequestParam(value = "nameid", required = false) String id){
    	List<Equipment> equipment=new ArrayList<Equipment>();
    	if(id!=""){
    		int ID=Integer.parseInt(id);
    		equipment=equip.getAllEquipBySiteID(ID);
    		if(equipment.isEmpty()){
    			return ReturnValue.empty;
    		}
    	}
    	else{
    		return ReturnValue.error;
    	}
    	return equipment;
    }
}
