package com.chinatelecom.serviceimp;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chinatelecom.dao.InspectDao;
import com.chinatelecom.service.InspectService;

public class InspectServiceImpl implements InspectService{
	
	@Autowired
	private InspectDao inspect;
	@Override
	public List<Object> getInspectNameByEquipID(int equipmentID){
		return inspect.getInspectNameByEquipID(equipmentID);
	}
	@Override
	public Object getInspectResultByInspectID(int inspectID){
		return inspect.getInspectResultByInspectID(inspectID);
	}
	@Override
	public Object getInspectResultByDate(Date result){
		return inspect.getInspectResultByDate(result);
	}
	@Override
	public void setInspectResultByInspectID(int inspectID){
	}
}
