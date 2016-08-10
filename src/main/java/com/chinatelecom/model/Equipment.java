package com.chinatelecom.model;

import java.sql.Date;

public class Equipment {
	private int ID;
	private int RACKID;
	private String HOSTNAME;
	private int MANAGEMENTIP;
	private String HOSTLABEL;
	private int EQUIPMENTTYPE;
	private String USEFOR;
	private int SYSTEMID;
	private String SERIALNO;
	private int STARTLOCATION;
	private int WORTH;
	private String BELONGSTO;
	private Date MAINTENANCEDATE;
	private String MAINTENANCEDEP;
	private Date MAINTENANCEENDDATE;
	private Date FEUSED;
	private int OPTUSED;
	private int PARENTEQUIPMENT;
	private String COMMENTS;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getRACKID() {
		return RACKID;
	}
	public void setRACKID(int rACKID) {
		RACKID = rACKID;
	}
	public String getHOSTNAME() {
		return HOSTNAME;
	}
	public void setHOSTNAME(String hOSTNAME) {
		HOSTNAME = hOSTNAME;
	}
	public int getMANAGEMENTIP() {
		return MANAGEMENTIP;
	}
	public void setMANAGEMENTIP(int mANAGEMENTIP) {
		MANAGEMENTIP = mANAGEMENTIP;
	}
	public String getHOSTLABEL() {
		return HOSTLABEL;
	}
	public void setHOSTLABEL(String hOSTLABEL) {
		HOSTLABEL = hOSTLABEL;
	}
	public int getEQUIPMENTTYPE() {
		return EQUIPMENTTYPE;
	}
	public void setEQUIPMENTTYPE(int eQUIPMENTTYPE) {
		EQUIPMENTTYPE = eQUIPMENTTYPE;
	}
	public String getUSEFOR() {
		return USEFOR;
	}
	public void setUSEFOR(String uSEFOR) {
		USEFOR = uSEFOR;
	}
	public int getSYSTEMID() {
		return SYSTEMID;
	}
	public void setSYSTEMID(int sYSTEMID) {
		SYSTEMID = sYSTEMID;
	}
	public String getSERIALNO() {
		return SERIALNO;
	}
	public void setSERIALNO(String sERIALNO) {
		SERIALNO = sERIALNO;
	}
	public int getSTARTLOCATION() {
		return STARTLOCATION;
	}
	public void setSTARTLOCATION(int sTARTLOCATION) {
		STARTLOCATION = sTARTLOCATION;
	}
	public int getWORTH() {
		return WORTH;
	}
	public void setWORTH(int wORTH) {
		WORTH = wORTH;
	}
	public String getBELONGSTO() {
		return BELONGSTO;
	}
	public void setBELONGSTO(String bELONGSTO) {
		BELONGSTO = bELONGSTO;
	}
	public Date getMAINTENANCEDATE() {
		return MAINTENANCEDATE;
	}
	public void setMAINTENANCEDATE(Date mAINTENANCEDATE) {
		MAINTENANCEDATE = mAINTENANCEDATE;
	}
	public String getMAINTENANCEDEP() {
		return MAINTENANCEDEP;
	}
	public void setMAINTENANCEDEP(String mAINTENANCEDEP) {
		MAINTENANCEDEP = mAINTENANCEDEP;
	}
	public Date getMAINTENANCEENDDATE() {
		return MAINTENANCEENDDATE;
	}
	public void setMAINTENANCEENDDATE(Date mAINTENANCEENDDATE) {
		MAINTENANCEENDDATE = mAINTENANCEENDDATE;
	}
	public Date getFEUSED() {
		return FEUSED;
	}
	public void setFEUSED(Date fEUSED) {
		FEUSED = fEUSED;
	}
	public int getOPTUSED() {
		return OPTUSED;
	}
	public void setOPTUSED(int oPTUSED) {
		OPTUSED = oPTUSED;
	}
	public int getPARENTEQUIPMENT() {
		return PARENTEQUIPMENT;
	}
	public void setPARENTEQUIPMENT(int pARENTEQUIPMENT) {
		PARENTEQUIPMENT = pARENTEQUIPMENT;
	}
	public String getCOMMENTS() {
		return COMMENTS;
	}
	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}
	@Override
	public String toString() {
		return "Equipment [ID=" + ID + ", RACKID=" + RACKID + ", HOSTNAME=" + HOSTNAME + ", MANAGEMENTIP="
				+ MANAGEMENTIP + ", HOSTLABEL=" + HOSTLABEL + ", EQUIPMENTTYPE=" + EQUIPMENTTYPE + ", USEFOR=" + USEFOR
				+ ", SYSTEMID=" + SYSTEMID + ", SERIALNO=" + SERIALNO + ", STARTLOCATION=" + STARTLOCATION + ", WORTH="
				+ WORTH + ", BELONGSTO=" + BELONGSTO + ", MAINTENANCEDATE=" + MAINTENANCEDATE + ", MAINTENANCEDEP="
				+ MAINTENANCEDEP + ", MAINTENANCEENDDATE=" + MAINTENANCEENDDATE + ", FEUSED=" + FEUSED + ", OPTUSED="
				+ OPTUSED + ", PARENTEQUIPMENT=" + PARENTEQUIPMENT + ", COMMENTS=" + COMMENTS + "]";
	}
}
