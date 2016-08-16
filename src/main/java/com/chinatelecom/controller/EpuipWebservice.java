package com.chinatelecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatelecom.model.Room;
import com.chinatelecom.model.Site;
import com.chinatelecom.service.equipservice;

@Controller
@RequestMapping("/allepuipinfo")
public class EpuipWebservice {

    @Autowired
    private equipservice equip;

    @RequestMapping("/getallepuipinfo")
    @ResponseBody
    public Object getSiteInfoBySite(
            @RequestParam(value = "nameid", required = false) String name) {
        int ID = Integer.parseInt(name);
        List<Room> site = equip.getAllRoomBySite(ID);
        if(site.isEmpty()){
            return "no information";
        }
        return site.toString();
    }  
}
