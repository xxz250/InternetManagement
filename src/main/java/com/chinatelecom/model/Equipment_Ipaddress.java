package com.chinatelecom.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Equipment_Ipaddress implements Serializable{
	private int ID;
	private int EQUIPMENTID;
	private int IPADDRESSID;
	private int TYPE;
	private int COMMENTS;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getEQUIPMENTID() {
		return EQUIPMENTID;
	}
	public void setEQUIPMENTID(int eQUIPMENTID) {
		EQUIPMENTID = eQUIPMENTID;
	}
	public int getIPADDRESSID() {
		return IPADDRESSID;
	}
	public void setIPADDRESSID(int iPADDRESSID) {
		IPADDRESSID = iPADDRESSID;
	}
	public int getTYPE() {
		return TYPE;
	}
	public void setTYPE(int tYPE) {
		TYPE = tYPE;
	}
	public int getCOMMENTS() {
		return COMMENTS;
	}
	public void setCOMMENTS(int cOMMENTS) {
		COMMENTS = cOMMENTS;
	}
	@Override
	public String toString() {
		return "Equipment_Ipaddress [ID=" + ID + ", EQUIPMENTID=" + EQUIPMENTID + ", IPADDRESSID=" + IPADDRESSID
				+ ", TYPE=" + TYPE + ", COMMENTS=" + COMMENTS + "]";
	}

}
