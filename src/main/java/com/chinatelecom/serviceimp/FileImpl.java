package com.chinatelecom.serviceimp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileImpl {	
	public void WriteFile(String filepath,String context) {
		try {
			FileWriter fileWritter = new FileWriter(filepath, true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write(context);
			bufferWritter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
