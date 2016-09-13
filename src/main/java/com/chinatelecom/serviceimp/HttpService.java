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
                break;
        	} 
        	else row++;
        }    
        bufferedReader.close();    
        inputStreamReader.close(); 
		socket.close();		
		return buffer.toString(); 
	}
	
	public String sendPost(String url,String num,String nameid,String param) throws IOException
	{
		StringBuffer buffer = new StringBuffer();
		String data = URLEncoder.encode("nameid", "utf-8") + "=" + URLEncoder.encode(nameid, "utf-8") + "&" +
						URLEncoder.encode("param", "utf-8") + "=" + URLEncoder.encode(param, "utf-8");
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
		if(num.equals("1")){
			buffer.append("login successfully!");
		}
		else{
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
		}
		socket.close();	
		return buffer.toString();
	}
	
	public String sendPost(String url,String nameid) throws IOException
	{
		StringBuffer buffer = new StringBuffer();
		String data = URLEncoder.encode("nameid", "utf-8") + "=" + URLEncoder.encode(nameid, "utf-8");
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
		InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream(), "utf-8");    
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);    
        String str = null; 
        int row=0;
        while ((str = bufferedReader.readLine()) != null) { 
        	if(row==7){
        		buffer.append(str.toString());  
                row++;
                break;
        	} 
        	else row++;
        } 
        bufferedReader.close();    
        inputStreamReader.close(); 
		socket.close();	
		return buffer.toString();
	}
}