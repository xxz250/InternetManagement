/*package com.chinatelecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatelecom.service.ipservice;

@Controller
@RequestMapping("/allipinfo")
public class IpWebservice {
     
    @Autowired
    private ipservice ip;

    @RequestMapping("/getallipinfo")
    @ResponseBody
    
    public Object getResPoolInfo(@RequestParam(value = "nameid",required = false) String name) {
        int ID=Integer.parseInt(name); 
        Object result=ip.getResPoolInfo(ID);
        if(null==result){
            return "no infomation";
        }
        return result; 
    } 
    public Object getAreaNameByResPoolID(@RequestParam(value = "nameid",required = false) String name) {
        int ID=Integer.parseInt(name); 
        Object result=ip.getAreaNameByResPoolID(ID);
        if(null==result){
            return "no infomation";
        }
        return result; 
    } 
    public Object getAreaInfoByAreaID(@RequestParam(value = "nameid",required = false) String name) {
        int ID=Integer.parseInt(name); 
        Object result=ip.getAreaInfoByAreaID(ID);
        if(null==result){
            return "no infomation";
        }
        return result; 
    } 
    public Object getSegmentIpByAreaID(@RequestParam(value = "nameid",required = false) String name) {
        int ID=Integer.parseInt(name); 
        Object result=ip.getSegmentIpByAreaID(ID);
        if(null==result){
            return "no infomation";
        }
        return result; 
    } 
    public Object getSegmentIpInfoBySegmentID(@RequestParam(value = "nameid",required = false) String name) {
        int ID=Integer.parseInt(name); 
        Object result=ip.getSegmentIpInfoBySegmentID(ID);
        if(null==result){
            return "no infomation";
        }
        return result; 
    } 
    public Object getIpNameBySegmentIpID(@RequestParam(value = "nameid",required = false) String name) {
        int ID=Integer.parseInt(name); 
        Object result=ip.getIpNameBySegmentIpID(ID);
        if(null==result){
            return "no infomation";
        }
        return result; 
    } 
    public Object getIpInfoByIpID(@RequestParam(value = "nameid",required = false) String name) {
        int ID=Integer.parseInt(name); 
        Object result=ip.getIpInfoByIpID(ID);
        if(null==result){
            return "no infomation";
        }
        return result; 
    } 
    public Object getIpMapByMapID(@RequestParam(value = "nameid",required = false) String name) {
        int ID=Integer.parseInt(name); 
        Object result=ip.getIpMapByMapID(ID);
        if(null==result){
            return "no infomation";
        }
        return result; 
    } 

}
*/