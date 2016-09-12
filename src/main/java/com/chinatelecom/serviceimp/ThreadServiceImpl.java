package com.chinatelecom.serviceimp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadServiceImpl extends Thread{
	//public static ArrayList<Socket> sockets = new ArrayList<Socket>();
	
	@SuppressWarnings("resource")
	@Override
	public void run(){
		try {
			ServerSocket serverSocket = new ServerSocket(8088);
			while(true){
				Socket socket = serverSocket.accept();
				//sockets.add(socket);
				new Thread(new SocketServiceImpl(socket)).start();	
			}	
		} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	
}
