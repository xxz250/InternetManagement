package com.chinatelecom.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinatelecom.dao.mapper.InspectMapper;

@Repository
public class InspectDao {
	@Autowired
	private InspectMapper inspect;
	public List<Object> getInspectNameByEquipID(int equipmentID){
		return inspect.getInspectNameByEquipID(equipmentID);
	}
	public Object getInspectResultByInspectID(int inspectID){
		return inspect.getInspectResultByInspectID(inspectID);
	}
	public Object getInspectResultByDate(Date result){
		return inspect.getInspectResultByDate(result);
	}
	public void setInspectResultByInspectID(int inspectID){
	}
	
}
