package com.chinatelecom.model;

import java.sql.Date;

public class Ip {
    private int ID;
    private String IP;
    private String GATEWAY;
    private String HOSTNAME;
    private int IPSEGMENTID;
    private String USEFOR;
    private int IPGROUPID;
    private String PROPOSER;
    private Date CREATEDATE; 
    private String COMMENTS;
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getIP() {
        return IP;
    }
    public void setIP(String iP) {
        IP = iP;
    }
    public String getGATEWAY() {
        return GATEWAY;
    }
    public void setGATEWAY(String gATEWAY) {
        GATEWAY = gATEWAY;
    }
    public String getHOSTNAME() {
        return HOSTNAME;
    }
    public void setHOSTNAME(String hOSTNAME) {
        HOSTNAME = hOSTNAME;
    }
    public int getIPSEGMENTID() {
        return IPSEGMENTID;
    }
    public void setIPSEGMENTID(int iPSEGMENTID) {
        IPSEGMENTID = iPSEGMENTID;
    }
    public String getUSEFOR() {
        return USEFOR;
    }
    public void setUSEFOR(String uSEFOR) {
        USEFOR = uSEFOR;
    }
    public int getIPGROUPID() {
        return IPGROUPID;
    }
    public void setIPGROUPID(int iPGROUPID) {
        IPGROUPID = iPGROUPID;
    }
    public String getPROPOSER() {
        return PROPOSER;
    }
    public void setPROPOSER(String pROPOSER) {
        PROPOSER = pROPOSER;
    }
    public Date getCREATEDATE() {
        return CREATEDATE;
    }
    public void setCREATEDATE(Date cREATEDATE) {
        CREATEDATE = cREATEDATE;
    }
    public String getCOMMENTS() {
        return COMMENTS;
    }
    public void setCOMMENTS(String cOMMENTS) {
        COMMENTS = cOMMENTS;
    }
    @Override
    public String toString() {
        return "Ip [ID=" + ID + ", IP=" + IP + ", GATEWAY=" + GATEWAY + ", HOSTNAME=" + HOSTNAME + ", IPSEGMENTID="
                + IPSEGMENTID + ", USEFOR=" + USEFOR + ", IPGROUPID=" + IPGROUPID + ", PROPOSER=" + PROPOSER
                + ", CREATEDATE=" + CREATEDATE + ", COMMENTS=" + COMMENTS + "]";
    }  
}
