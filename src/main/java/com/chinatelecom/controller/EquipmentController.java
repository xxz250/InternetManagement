package com.chinatelecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatelecom.model.Site;
import com.chinatelecom.service.webservice;

@Controller
@RequestMapping("/infomanage")
public class EquipmentController {

    @Autowired
    private webservice web;

    @RequestMapping("/getinfo")
    @ResponseBody
    public Object getSiteInfoBySite(
            @RequestParam(value = "nameid", required = false) String name) {
        int ID = Integer.parseInt(name);
        List<Site> site = web.getSiteInfoBySiteID(ID);
        if(null==site){
            return "success";
        }
        return web.getSiteInfoBySiteID(ID).toString();
    }
    /*
     * public Object getRoomNameBySiteID(@RequestParam(value = "nameid",
     * required = false) String name) { int ID=Integer.parseInt(name); return
     * web.getRoomNameBySiteID(ID); } public String
     * getRoomInfoByRoomID(@RequestParam(value = "nameid", required = false)
     * String name) { int ID=Integer.parseInt(name); return
     * web.getRoomInfoByRoomID(ID).toString(); } public Object
     * getRackSequenceByRoomID(@RequestParam(value = "nameid", required = false)
     * String name) { int ID=Integer.parseInt(name); return
     * web.getRackSequenceByRoomID(ID); } public String
     * getRackInfoByRackID(@RequestParam(value = "nameid", required = false)
     * String name) { int ID=Integer.parseInt(name); return
     * web.getRackInfoByRackID(ID).toString(); } public String
     * getVendorInfoByVendorID(@RequestParam(value = "nameid", required = false)
     * String name) { int ID=Integer.parseInt(name); return
     * web.getVendorInfoByVendorID(ID).toString(); } public int
     * getEquipTypeByVendorID(@RequestParam(value = "nameid", required = false)
     * String name) { int ID=Integer.parseInt(name); return
     * web.getEquipTypeByVendorID(ID); } public Object
     * getEquipNameByRoomID(@RequestParam(value = "nameid", required = false)
     * String name) { int ID=Integer.parseInt(name); return
     * web.getEquipNameByRoomID(ID); } public Object
     * getEquipNameByRackID(@RequestParam(value = "nameid", required = false)
     * String name) { int ID=Integer.parseInt(name); return
     * web.getEquipNameByRackID(ID); } public Object
     * getEquipNameByEquipTypeID(@RequestParam(value = "nameid", required =
     * false) String name) { int ID=Integer.parseInt(name); return
     * web.getEquipNameByEquipTypeID(ID); } public String
     * getEquipInfoByEquipID(@RequestParam(value = "nameid", required = false)
     * String name) { int ID=Integer.parseInt(name); return
     * web.getEquipInfoByEquipID(ID).toString(); } public Object
     * getIpNameByEquipID(@RequestParam(value = "nameid", required = false)
     * String name) { int ID=Integer.parseInt(name); return
     * web.getIpNameByEquipID(ID); }
     */
}
