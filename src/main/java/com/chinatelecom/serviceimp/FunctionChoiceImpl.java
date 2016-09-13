package com.chinatelecom.serviceimp;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.chinatelecom.service.FunctionChoice;

public class FunctionChoiceImpl implements FunctionChoice{
	
	static HttpService http;
	@Override
	public void isLogin(String num,String name,String passwd){
		String result=null;
		http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendPost("http://localhost:8080/InternetManagement/loginManager/isLogin",num,name,passwd);
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"登录"+" ,"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/isLogin.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void quit(){
		//login.quit(null, null);
	}
	@Override
	public void getAllSite(){
		String result=null;
		http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/equipManager/getAllSite");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"局址"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllSite.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllRoom(){
		String result=null;
		http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/equipManager/getAllRoom");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"机房"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllRoom.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllRack(){
		String result=null;
		http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/equipManager/getAllRack");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"机架"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllRack.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllVendor(){
		String result=null;
		http = new HttpService("127.0.0.1",8080);
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/equipManager/getAllVendor");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"厂商"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllVendor.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllEquipmentType(){
		String result=null;
		http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/equipManager/getAllEquipmentType");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"设备类型"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllEquipmentType.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllRoomBySite(String id){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendPost("http://localhost:8080/InternetManagement/equipManager/getAllRoomBySite",id);
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"局址下机房"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllRoomBySite.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllEqulpmentByRack(String id){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendPost("http://localhost:8080/InternetManagement/equipManager/getAllEqulpmentByRack",id);
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"机架下设备"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllEqulpmentByRack.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllRackByRoom(String id){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendPost("http://localhost:8080/InternetManagement/equipManager/getAllRackByRoom",id);
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"机房下机架"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllRackByRoom.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllRackBySiteID(String id){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendPost("http://localhost:8080/InternetManagement/equipManager/getAllRackBySiteID",id);
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"局址下机架"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllRackBySiteID.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllEquipBySiteID(String id){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendPost("http://localhost:8080/InternetManagement/equipManager/getAllEquipBySiteID",id);
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"局址下设备"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllEquipBySiteID.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllEquipByEquipType(String id){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendPost("http://localhost:8080/InternetManagement/equipManager/getAllEquipByEquipType",id);
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"设备类型下设备"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllEquipByEquipType.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllEquipmentByVendorID(String id){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendPost("http://localhost:8080/InternetManagement/equipManager/getAllEquipmentByVendorID",id);
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"厂商下设备"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllEquipmentByVendorID.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllIp(){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/ipManager/getAllIp");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"IP"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllIp.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllMap(){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/ipManager/getAllMap");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"IP映射"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllMap.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getAllResPool(){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendGet("http://localhost:8080/InternetManagement/ipManager/getAllResPool");
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"资源池"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getAllResPool.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getIpByEquipID(String id){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendPost("http://localhost:8080/InternetManagement/ipManager/getIpByEquipID",id);
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"设备占用ip"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getIpByEquipID.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getIpMapByMapID(String id){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendPost("http://localhost:8080/InternetManagement/ipManager/getIpMapByMapID",id);
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"IP映射信息"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/getIpMapByMapID.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void IsOccupyOfIp(String num,String id,String ipaddr){
		String result=null;
		HttpService http = new HttpService("127.0.0.1",8080); 
		FileImpl file=new FileImpl();
		try {
			result=http.sendPost("http://localhost:8080/InternetManagement/ipManager/IsOccupyOfIp",num,id,ipaddr);
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			result= "时间:"+dateFormat.format(now)+" ,"+"接口:"+"ip是否占用"+"\r\n"+"结果:"+result+"\r\n"; 
			file.WriteFile("E:/chinatelecom/result/result/IsOccupyOfIp.txt", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}