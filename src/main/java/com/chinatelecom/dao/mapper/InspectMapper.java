package com.chinatelecom.dao.mapper;

import java.sql.Date;
import java.util.List;

public interface InspectMapper {
	public List<Object> getInspectNameByEquipID(int equipmentID); 
	public Object getInspectResultByInspectID(int inspectID);
	public Object getInspectResultByDate(Date result);
	public void setInspectResultByInspectID(int inspectID);
}
