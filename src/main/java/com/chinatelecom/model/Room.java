package com.chinatelecom.model;

public class Room {
	private int ID;
	private int SITEID;
	private String NAME;
	private String ROOMNUM;
	private int AREA;
	private int MAXRACKNUM;
	private int USEDRACKNUM;
	private int FREERACKNUM;
	private String USEFOR;
	private String COMMENTS;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getSITEID() {
		return SITEID;
	}
	public void setSITEID(int sITEID) {
		SITEID = sITEID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getROOMNUM() {
		return ROOMNUM;
	}
	public void setROOMNUM(String rOOMNUM) {
		ROOMNUM = rOOMNUM;
	}
	public int getAREA() {
		return AREA;
	}
	public void setAREA(int aREA) {
		AREA = aREA;
	}
	public int getMAXRACKNUM() {
		return MAXRACKNUM;
	}
	public void setMAXRACKNUM(int mAXRACKNUM) {
		MAXRACKNUM = mAXRACKNUM;
	}
	public int getUSEDRACKNUM() {
		return USEDRACKNUM;
	}
	public void setUSEDRACKNUM(int uSEDRACKNUM) {
		USEDRACKNUM = uSEDRACKNUM;
	}
	public int getFREERACKNUM() {
		return FREERACKNUM;
	}
	public void setFREERACKNUM(int fREERACKNUM) {
		FREERACKNUM = fREERACKNUM;
	}
	public String getUSEFOR() {
		return USEFOR;
	}
	public void setUSEFOR(String uSEFOR) {
		USEFOR = uSEFOR;
	}
	public String getCOMMENTS() {
		return COMMENTS;
	}
	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}

}
