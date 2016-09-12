package com.chinatelecom.serviceimp;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.chinatelecom.controller.EpuipWebservice;
import com.chinatelecom.controller.IpWebservice;
import com.chinatelecom.controller.LoginWebservice;
import com.chinatelecom.service.FunctionChoice;

public class FunctionChoiceImpl implements FunctionChoice{
	
	@Autowired
	private EpuipWebservice equip = new EpuipWebservice();
	@Autowired
	private IpWebservice ip = new IpWebservice();
	@Autowired
	private LoginWebservice login = new LoginWebservice();
	
	@Override
	public void isLogin(String name,String passwd){
		login.isLogin(null, name, passwd);
	}
	@Override
	public void quit(){
		login.quit(null, null);
	}
	@Override
	public void getAllSite(){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/equipManager/getAllSite");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口："+"局址"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllSite.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllRoom(){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/equipManager/getAllRoom");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口："+"机房"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllRoom.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllRack(){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/equipManager/getAllRack");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口："+"机架"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllRack.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllVendor(){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080);
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/equipManager/getAllVendor");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口："+"厂商"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllVendor.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllEquipmentType(){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/equipManager/getAllEquipmentType");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口："+"设备类型"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllEquipmentType.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllRoomBySite(String id){
		equip.getAllRoomBySite(null,id);
	}
	@Override
	public void getAllEqulpmentByRack(String id){
		equip.getAllEqulpmentByRack(null,id);
	}
	@Override
	public void getAllRackByRoom(String id){
		equip.getAllRackByRoom(null,id);
	}
	@Override
	public void getAllRackBySiteID(String id){
		equip.getAllRackBySiteID(null,id);
	}
	@Override
	public void getAllEquipBySiteID(String id){
		equip.getAllEquipBySiteID(null,id);
	}
	@Override
	public void getAllEquipByEquipType(String id){
		equip.getAllEquipByEquipType(null,id);
	}
	@Override
	public void getAllEquipmentByVendorID(String id){
		equip.getAllEquipmentByVendorID(null,id);
	}
	@Override
	public void getAllIp(){
		ip.getAllIp();
	}
	@Override
	public void getAllMap(){
		ip.getAllMap();
	}
	@Override
	public void getAllResPool(){
		ip.getAllResPool();
	}
	@Override
	public void getIpByEquipID(String id){
		ip.getIpByEquipID(null, id);
	}
	@Override
	public void getIpMapByMapID(String id){
		ip.getIpMapByMapID(null, id);
	}
	@Override
	public void IsOccupyOfIp(String id,String ipaddr){
		ip.IsOccupyOfIp(null, id, ipaddr);
	}
}