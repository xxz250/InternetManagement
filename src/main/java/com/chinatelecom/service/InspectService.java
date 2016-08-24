package com.chinatelecom.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface InspectService {
	public List<Object> getInspectNameByEquipID(int equipmentID);
	public Object getInspectResultByInspectID(int inspectID);
	public Object getInspectResultByDate(Date result);
	public void setInspectResultByInspectID(int inspectID);
}
