package com.chinatelecom.controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatelecom.constants.ReturnValue;
import com.chinatelecom.service.InspectService;

@Controller
@RequestMapping("/allinspectinfo")
public class InspectWebservice {

    @Autowired
    private InspectService inspect;

    @RequestMapping("/getallinspectinfo")
    @ResponseBody
    public Object getInspectNameByEquipID(
    		@RequestParam(value = "equipid", required = false) String id){
    	List<Object> InspectList = new ArrayList<Object>(); 
    	if(id!=""){
    		int ID = Integer.parseInt(id);
    		InspectList=inspect.getInspectNameByEquipID(ID);
            if(InspectList.isEmpty()){
                return ReturnValue.empty;
            }
    	}
    	else{
    		return ReturnValue.error;
    	}
    	return InspectList;
    }
    public Object getInspectResultByInspectID(
    		@RequestParam(value = "inspectid", required = false) String id){
    	Object Result = new Object(); 
    	if(id!=""){
    		int ID = Integer.parseInt(id);
    		Result=inspect.getInspectResultByInspectID(ID);
            if(Result!=null){
                return ReturnValue.empty;
            }
    	}
    	else{
    		return ReturnValue.error;
    	}
    	return Result;
    }
	public Object getInspectResultByDate(
			@RequestParam(value = "date", required = false) String result){
		Object Result = new Object(); 
    	if(result!=""){
    		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    		 try {
    			 Date date= new Date(sdf.parse(result).getTime());
    			 Result=inspect.getInspectResultByDate(date);
    		 } catch (ParseException e) {
    			   e.printStackTrace();
    		 	}
            if(Result!=null){
                return ReturnValue.empty;
            }
    	}
    	else{
    		return ReturnValue.error;
    	}
    	return Result;
	}
	public void setInspectResultByInspectID(int inspectID){
		inspect.setInspectResultByInspectID(inspectID);
	}
}
