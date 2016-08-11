package com.chinatelecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinatelecom.dao.equipmentDao;

@Controller
@RequestMapping("/firststep")
public class EquipmentController {

    @Autowired
    private equipmentDao ed;

    @RequestMapping("/secondstep")
    public Object test(@RequestParam(value = "nameid", required = false) String name) {
        
        return ed.getEquipInfoByEquipID(1);
    }
}
