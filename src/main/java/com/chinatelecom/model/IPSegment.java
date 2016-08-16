package com.chinatelecom.model;

public class IPSegment {
    private int ID;
    private int AREAID;
    private String IP;
    private int MASK;
    private int VLAN;
    private int TYPE;
    private int PARENTIPSEGMENT; 
    private String USEFOR;
    private String COMMENTS;
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getAREAID() {
        return AREAID;
    }
    public void setAREAID(int aREAID) {
        AREAID = aREAID;
    }
    public String getIP() {
        return IP;
    }
    public void setIP(String iP) {
        IP = iP;
    }
    public int getMASK() {
        return MASK;
    }
    public void setMASK(int mASK) {
        MASK = mASK;
    }
    public int getVLAN() {
        return VLAN;
    }
    public void setVLAN(int vLAN) {
        VLAN = vLAN;
    }
    public int getTYPE() {
        return TYPE;
    }
    public void setTYPE(int tYPE) {
        TYPE = tYPE;
    }
    public int getPARENTIPSEGMENT() {
        return PARENTIPSEGMENT;
    }
    public void setPARENTIPSEGMENT(int pARENTIPSEGMENT) {
        PARENTIPSEGMENT = pARENTIPSEGMENT;
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
    @Override
    public String toString() {
        return "IPSegment [ID=" + ID + ", AREAID=" + AREAID + ", IP=" + IP + ", MASK=" + MASK + ", VLAN=" + VLAN
                + ", TYPE=" + TYPE + ", PARENTIPSEGMENT=" + PARENTIPSEGMENT + ", USEFOR=" + USEFOR + ", COMMENTS="
                + COMMENTS + "]";
    }
}
