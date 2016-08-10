package com.chinatelecom.model;

public class Rack {
	private int ID;
	private int ROOMID;
	private String COLUMEID;
	private int SEQUENCE;
	private double HEIGHT;
	private double LOCATIONX;
	private double LOCATIONY;
	private int ISINMAINTENCE;
	private int ISStandarded;
	private String COMMENTS;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getROOMID() {
		return ROOMID;
	}
	public void setROOMID(int rOOMID) {
		ROOMID = rOOMID;
	}
	public String getCOLUMEID() {
		return COLUMEID;
	}
	public void setCOLUMEID(String cOLUMEID) {
		COLUMEID = cOLUMEID;
	}
	public int getSEQUENCE() {
		return SEQUENCE;
	}
	public void setSEQUENCE(int sEQUENCE) {
		SEQUENCE = sEQUENCE;
	}
	public double getHEIGHT() {
		return HEIGHT;
	}
	public void setHEIGHT(double hEIGHT) {
		HEIGHT = hEIGHT;
	}
	public double getLOCATIONX() {
		return LOCATIONX;
	}
	public void setLOCATIONX(double lOCATIONX) {
		LOCATIONX = lOCATIONX;
	}
	public double getLOCATIONY() {
		return LOCATIONY;
	}
	public void setLOCATIONY(double lOCATIONY) {
		LOCATIONY = lOCATIONY;
	}
	public int getISINMAINTENCE() {
		return ISINMAINTENCE;
	}
	public void setISINMAINTENCE(int iSINMAINTENCE) {
		ISINMAINTENCE = iSINMAINTENCE;
	}
	public int getISStandarded() {
		return ISStandarded;
	}
	public void setISStandarded(int iSStandarded) {
		ISStandarded = iSStandarded;
	}
	public String getCOMMENTS() {
		return COMMENTS;
	}
	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}
	@Override
	public String toString() {
		return "Rack [ID=" + ID + ", ROOMID=" + ROOMID + ", COLUMEID=" + COLUMEID + ", SEQUENCE=" + SEQUENCE
				+ ", HEIGHT=" + HEIGHT + ", LOCATIONX=" + LOCATIONX + ", LOCATIONY=" + LOCATIONY + ", ISINMAINTENCE="
				+ ISINMAINTENCE + ", ISStandarded=" + ISStandarded + ", COMMENTS=" + COMMENTS + "]";
	}
	
}
