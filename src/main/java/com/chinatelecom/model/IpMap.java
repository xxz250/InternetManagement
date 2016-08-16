package com.chinatelecom.model;

public class IpMap {
    private int ID ;
    private int SRCID;
    private String SRCDES;
    private int DESTID;
    private String DESTDES;
    private int DIRECTION;
    private String COMMENTS;
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getSRCID() {
        return SRCID;
    }
    public void setSRCID(int sRCID) {
        SRCID = sRCID;
    }
    public String getSRCDES() {
        return SRCDES;
    }
    public void setSRCDES(String sRCDES) {
        SRCDES = sRCDES;
    }
    public int getDESTID() {
        return DESTID;
    }
    public void setDESTID(int dESTID) {
        DESTID = dESTID;
    }
    public String getDESTDES() {
        return DESTDES;
    }
    public void setDESTDES(String dESTDES) {
        DESTDES = dESTDES;
    }
    public int getDIRECTION() {
        return DIRECTION;
    }
    public void setDIRECTION(int dIRECTION) {
        DIRECTION = dIRECTION;
    }
    public String getCOMMENTS() {
        return COMMENTS;
    }
    public void setCOMMENTS(String cOMMENTS) {
        COMMENTS = cOMMENTS;
    }
    @Override
    public String toString() {
        return "IpMap [ID=" + ID + ", SRCID=" + SRCID + ", SRCDES=" + SRCDES + ", DESTID=" + DESTID + ", DESTDES="
                + DESTDES + ", DIRECTION=" + DIRECTION + ", COMMENTS=" + COMMENTS + "]";
    } 
}
