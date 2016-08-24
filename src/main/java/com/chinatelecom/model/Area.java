package com.chinatelecom.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Area implements Serializable{
    private int ID;  
    private String NAME;
    private String TYPE;
    private int RESPOOLID;
    private int PARENTAREAID;
    private String USEFOR;
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
    public String getTYPE() {
        return TYPE;
    }
    public void setTYPE(String tYPE) {
        TYPE = tYPE;
    }
    public int getRESPOOLID() {
        return RESPOOLID;
    }
    public void setRESPOOLID(int rESPOOLID) {
        RESPOOLID = rESPOOLID;
    }
    public int getPARENTAREAID() {
        return PARENTAREAID;
    }
    public void setPARENTAREAID(int pARENTAREAID) {
        PARENTAREAID = pARENTAREAID;
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
        return "Area [ID=" + ID + ", NAME=" + NAME + ", TYPE=" + TYPE + ", RESPOOLID=" + RESPOOLID + ", PARENTAREAID="
                + PARENTAREAID + ", USEFOR=" + USEFOR + ", COMMENTS=" + COMMENTS + "]";
    }
}
