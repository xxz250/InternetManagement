package com.chinatelecom.webservice;

import com.chinatelecom.dao.equipmentDao;

public class webserviceimpl {
	
	public static void main(String[] args) {                   
		equipmentDao info=new equipmentDao();
		info.getEquipInfoByEquipID(1);
    }  
}

