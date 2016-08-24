package com.chinatelecom.model;

public class Site /*implements Serializable*/{
	private int ID;
	private String SITENAME;
	private String ADDRESS;
	private String COMMENTS;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSITENAME() {
		return SITENAME;
	}
	public void setSITENAME(String sITENAME) {
		SITENAME = sITENAME;
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
		return "Site [ID=" + ID + ", SITENAME=" + SITENAME + ", ADDRESS=" + ADDRESS + ", COMMENTS=" + COMMENTS + "]";
	}
}
