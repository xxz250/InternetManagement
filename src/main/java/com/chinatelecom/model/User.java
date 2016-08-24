package com.chinatelecom.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable{
	private int ID;
	private String LOGINNAME; 
	private int LOGINTIMES;
	private String NAME;
	private String DEPARTMENT;
	private String PHONE;
	private int RULEID;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getLOGINNAME() {
		return LOGINNAME;
	}
	public void setLOGINNAME(String lOGINNAME) {
		LOGINNAME = lOGINNAME;
	}
	public int getLOGINTIMES() {
		return LOGINTIMES;
	}
	public void setLOGINTIMES(int lOGINTIMES) {
		LOGINTIMES = lOGINTIMES;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getDEPARTMENT() {
		return DEPARTMENT;
	}
	public void setDEPARTMENT(String dEPARTMENT) {
		DEPARTMENT = dEPARTMENT;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public int getRULEID() {
		return RULEID;
	}
	public void setRULEID(int rULEID) {
		RULEID = rULEID;
	}
	@Override
	public String toString() {
		return "User [ID=" + ID + ", LOGINNAME=" + LOGINNAME + ", LOGINTIMES=" + LOGINTIMES + ", NAME=" + NAME
				+ ", DEPARTMENT=" + DEPARTMENT + ", PHONE=" + PHONE + ", RULEID=" + RULEID + "]";
	}
}
