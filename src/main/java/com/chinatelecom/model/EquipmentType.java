package com.chinatelecom.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EquipmentType implements Serializable{
		private int ID;
		private int VENDORID;
		private int TYPE;
		private String MODEL;
		private int HEIGHT;
		private int POWER;
		private int FETOTAL;
		private int OPTTOTAL;
		private int WEIGHT;
		private String COMMENTS;
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public int getVENDORID() {
			return VENDORID;
		}
		public void setVENDORID(int vENDORID) {
			VENDORID = vENDORID;
		}
		public int getTYPE() {
			return TYPE;
		}
		public void setTYPE(int tYPE) {
			TYPE = tYPE;
		}
		public String getMODEL() {
			return MODEL;
		}
		public void setMODEL(String mODEL) {
			MODEL = mODEL;
		}
		public int getHEIGHT() {
			return HEIGHT;
		}
		public void setHEIGHT(int hEIGHT) {
			HEIGHT = hEIGHT;
		}
		public int getPOWER() {
			return POWER;
		}
		public void setPOWER(int pOWER) {
			POWER = pOWER;
		}
		public int getFETOTAL() {
			return FETOTAL;
		}
		public void setFETOTAL(int fETOTAL) {
			FETOTAL = fETOTAL;
		}
		public int getOPTTOTAL() {
			return OPTTOTAL;
		}
		public void setOPTTOTAL(int oPTTOTAL) {
			OPTTOTAL = oPTTOTAL;
		}
		public int getWEIGHT() {
			return WEIGHT;
		}
		public void setWEIGHT(int wEIGHT) {
			WEIGHT = wEIGHT;
		}
		public String getCOMMENTS() {
			return COMMENTS;
		}
		public void setCOMMENTS(String cOMMENTS) {
			COMMENTS = cOMMENTS;
		}
		@Override
		public String toString() {
			return "EquipmentType [ID=" + ID + ", VENDORID=" + VENDORID + ", TYPE=" + TYPE + ", MODEL=" + MODEL
					+ ", HEIGHT=" + HEIGHT + ", POWER=" + POWER + ", FETOTAL=" + FETOTAL + ", OPTTOTAL=" + OPTTOTAL
					+ ", WEIGHT=" + WEIGHT + ", COMMENTS=" + COMMENTS + "]";
		}
		
		
}
