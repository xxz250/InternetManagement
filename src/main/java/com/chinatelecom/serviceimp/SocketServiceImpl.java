package com.chinatelecom.serviceimp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketServiceImpl implements Runnable {
	private Socket socket = null;

	public SocketServiceImpl() {
	}

	public SocketServiceImpl(Socket socket) throws IOException {
		this.socket = socket;
		new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
	}

	@Override
	public void run() {
		try {
			String[] info;
			int functionNum = 0;
			FunctionChoiceImpl function = new FunctionChoiceImpl();
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 读到的数据格式是功能编号#参数1#参数2			
			info = reader.readLine().toString().split("#");
			functionNum = Integer.parseInt(info[0]);
			switch (functionNum) {
			case 1:
				function.isLogin(info[0],info[1],info[2]);
				break;
			case 2:
				function.quit();
				break;
			case 3:
				function.getAllSite();
				break;
			case 4:
				function.getAllRoom();
				break;
			case 5:
				function.getAllRack();
				break;
			case 6:
				function.getAllVendor();
				break;
			case 7:
				function.getAllEquipmentType();
				break;
			case 8:
				function.getAllRoomBySite(info[1]);
				break;
			case 9:
				function.getAllEqulpmentByRack(info[1]);
				break;
			case 10:
				function.getAllRackByRoom(info[1]);
				break;
			case 11:
				function.getAllRackBySiteID(info[1]);
				break;
			case 12:
				function.getAllEquipBySiteID(info[1]);
				break;
			case 13:
				function.getAllEquipByEquipType(info[1]);
				break;
			case 14:
				function.getAllEquipmentByVendorID(info[1]);
				break;
			case 15:
				function.getAllIp();
				break;
			case 16:
				function.getAllMap();
				break;
			case 17:
				function.getAllResPool();
				break;
			case 18:
				function.getIpByEquipID(info[1]);
				break;
			case 19:
				function.getIpMapByMapID(info[1]);
			case 20:
				function.IsOccupyOfIp(info[0],info[1],info[2]);
				break;
			default:
				break;
			}  
            reader.close();   
            socket.close();  
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
