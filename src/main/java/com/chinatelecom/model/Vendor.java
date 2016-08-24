package com.chinatelecom.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Vendor implements Serializable{
	private int ID;
	private String NAME;
	private String NAMEABB;
	private String ADDRESS;
	private String COMMENTS;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getNAMEABB() {
		return NAMEABB;
	}
	public void setNAMEABB(String nAMEABB) {
		NAMEABB = nAMEABB;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getCOMMENTS() {
		return COMMENTS;
	}
	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}
	@Override
	public String toString() {
		return "Vendor [ID=" + ID + ", NAME=" + NAME + ", NAMEABB=" + NAMEABB + ", ADDRESS=" + ADDRESS + ", COMMENTS="
				+ COMMENTS + "]";
	}

}
