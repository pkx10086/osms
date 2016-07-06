package com.pkx.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Start {
	
	public static void main(String args[]){
		
		Start start = new Start();
			try {
				start.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	public void close() throws IOException{
	  Process process = Runtime.getRuntime().exec("cmd /c  C:\\apache-tomcat-7.0.52\\bin\\\\shutdown.bat"); // 调用外部程序
	    final InputStream in = process.getInputStream();
	    BufferedReader br=new BufferedReader(new InputStreamReader(in));
	    StringBuilder buf = new StringBuilder();
	    String line = null;
	    while((line = br.readLine()) != null)
	  buf.append(line);
	    System.out.println("输出结果为：" + buf);
	 }
	 
	 
	public  void start() throws IOException{
		
		Process process = Runtime.getRuntime().exec("cmd /c  C:\\apache-tomcat-7.0.52\\bin\\startup.bat"); // 调用外部程序
		final InputStream  inputStream =process.getInputStream();
	    BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
		StringBuilder buf = new StringBuilder();
		 String line = null;
		 while((line = br.readLine()) != null){
			 		buf.append(line);
		 }
		    System.out.println("输出结果为：" + buf);
	}
}
