package com.chinatelecom.model;

public class ResPool /*implements Serializable*/{
    private int ID;
    private String NAME;
    private String ADDRESS;
    private String POSTALCODE;
    private int SITEID;
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
    public String getADDRESS() {
        return ADDRESS;
    }
    public void setADDRESS(String aDDRESS) {
        ADDRESS = aDDRESS;
    }
    public String getPOSTALCODE() {
        return POSTALCODE;
    }
    public void setPOSTALCODE(String pOSTALCODE) {
        POSTALCODE = pOSTALCODE;
    }
    public int getSITEID() {
        return SITEID;
    }
    public void setSITEID(int sITEID) {
        SITEID = sITEID;
    }
    @Override
    public String toString() {
        return "ResPool [ID=" + ID + ", NAME=" + NAME + ", ADDRESS=" + ADDRESS + ", POSTALCODE=" + POSTALCODE
                + ", SITEID=" + SITEID + "]";
    }
}
