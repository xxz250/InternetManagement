package com.chinatelecom.serviceimp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URLEncoder;

public class HttpService {
	private int port;
	private String host;
	private Socket socket;
	private BufferedWriter bufferedWriter; 
	public HttpService(){}
	public HttpService(String host, int port) {
		socket = new Socket();
		this.host = host;
		this.port = port;
	}
	
	public String sendGet(String url) throws IOException
	{
		StringBuffer buffer = new StringBuffer();
		SocketAddress dest = new InetSocketAddress(this.host, this.port);
		socket.connect(dest);
		OutputStreamWriter streamWriter = new OutputStreamWriter(socket.getOutputStream());
		bufferedWriter = new BufferedWriter(streamWriter);		
		bufferedWriter.write("GET " + url + " HTTP/1.1\r\n");
		bufferedWriter.write("Host: " + this.host + "\r\n");
		bufferedWriter.write("\r\n");
		bufferedWriter.flush();  
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream(), "utf-8");    
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);    
        String str = null; 
        int row=0;
        while ((str = bufferedReader.readLine()) != null) { 
        	if(row==7){
        		buffer.append(str.toString());  
                row++;
        	} 
        	else row++;
        }    
        bufferedReader.close();    
        inputStreamReader.close(); 
		socket.close();		
		return buffer.toString(); 
	}
	
	public void sendPost(String url) throws IOException
	{
		String data = URLEncoder.encode("name", "utf-8") + "=" + URLEncoder.encode("gloomyfish", "utf-8") + "&" +
						URLEncoder.encode("age", "utf-8") + "=" + URLEncoder.encode("32", "utf-8");
		SocketAddress dest = new InetSocketAddress(this.host, this.port);
		socket.connect(dest);
		OutputStreamWriter streamWriter = new OutputStreamWriter(socket.getOutputStream(), "utf-8");
		bufferedWriter = new BufferedWriter(streamWriter);		
		bufferedWriter.write("POST " + url + " HTTP/1.1\r\n");
		bufferedWriter.write("Host: " + this.host + "\r\n");
		bufferedWriter.write("Content-Length: " + data.length() + "\r\n");
		bufferedWriter.write("Content-Type: application/x-www-form-urlencoded\r\n");
		bufferedWriter.write("\r\n");
		bufferedWriter.write(data);
		bufferedWriter.flush();
		bufferedWriter.write("\r\n");
		bufferedWriter.flush();
		socket.close();
	}
}