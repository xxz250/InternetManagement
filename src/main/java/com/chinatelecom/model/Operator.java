package com.chinatelecom.model;

import java.sql.Date;

public class Operator {
	private int ID;
	private String LOGINNAME;
	private String PASSWD; 
	private String CREATOR;
	private Date CREATEDATE;
	private int LOGINTIMES;
	private String ACCOUNTSTATUS;
	private Date PWDEXPDATE;
	private String NAME;
	private String DEPARTMENT;
	private String PHONE;
	private String EMAIL;
	private Date LASTLOGINTIME;
	private Date LASTLOGOUTTIME;
	private int RULEID;
	private String COMMENTS;
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
	public String getPASSWD() {
		return PASSWD;
	}
	public void setPASSWD(String pASSWD) {
		PASSWD = pASSWD;
	}
	public String getCREATOR() {
		return CREATOR;
	}
	public void setCREATOR(String cREATOR) {
		CREATOR = cREATOR;
	}
	public Date getCREATEDATE() {
		return CREATEDATE;
	}
	public void setCREATEDATE(Date cREATEDATE) {
		CREATEDATE = cREATEDATE;
	}
	public int getLOGINTIMES() {
		return LOGINTIMES;
	}
	public void setLOGINTIMES(int lOGINTIMES) {
		LOGINTIMES = lOGINTIMES;
	}
	public String getACCOUNTSTATUS() {
		return ACCOUNTSTATUS;
	}
	public void setACCOUNTSTATUS(String aCCOUNTSTATUS) {
		ACCOUNTSTATUS = aCCOUNTSTATUS;
	}
	public Date getPWDEXPDATE() {
		return PWDEXPDATE;
	}
	public void setPWDEXPDATE(Date pWDEXPDATE) {
		PWDEXPDATE = pWDEXPDATE;
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
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public Date getLASTLOGINTIME() {
		return LASTLOGINTIME;
	}
	public void setLASTLOGINTIME(Date lASTLOGINTIME) {
		LASTLOGINTIME = lASTLOGINTIME;
	}
	public Date getLASTLOGOUTTIME() {
		return LASTLOGOUTTIME;
	}
	public void setLASTLOGOUTTIME(Date lASTLOGOUTTIME) {
		LASTLOGOUTTIME = lASTLOGOUTTIME;
	}
	public int getRULEID() {
		return RULEID;
	}
	public void setRULEID(int rULEID) {
		RULEID = rULEID;
	}
	public String getCOMMENTS() {
		return COMMENTS;
	}
	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}
	@Override
	public String toString() {
		return "Operator [ID=" + ID + ", LOGINNAME=" + LOGINNAME + ", PASSWD=" + PASSWD + ", CREATOR=" + CREATOR
				+ ", CREATEDATE=" + CREATEDATE + ", LOGINTIMES=" + LOGINTIMES + ", ACCOUNTSTATUS=" + ACCOUNTSTATUS
				+ ", PWDEXPDATE=" + PWDEXPDATE + ", NAME=" + NAME + ", DEPARTMENT=" + DEPARTMENT + ", PHONE=" + PHONE
				+ ", EMAIL=" + EMAIL + ", LASTLOGINTIME=" + LASTLOGINTIME + ", LASTLOGOUTTIME=" + LASTLOGOUTTIME
				+ ", RULEID=" + RULEID + ", COMMENTS=" + COMMENTS + "]";
	}
}
