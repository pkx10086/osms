package com.pkx.utils;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import javax.servlet.ServletException;

import org.apache.catalina.Container;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class TomcatServer  implements Runnable{
	
	public Tomcat tomcat;
			
	public Thread serverThread;
		
    public TomcatServer(){
		tomcat=new Tomcat();
	 }

    public void start(){
    	serverThread=new Thread(this);
    	serverThread.start();
    }

	
	

	//启动tomcat的关键代码
	public void StartTomcat(){
		try {
				String homeDir=new File("").getAbsolutePath();
				System.out.println(homeDir);
				tomcat.setPort(15435);
				tomcat.setBaseDir(homeDir+"/"+"server");
				Container[] container= tomcat.getHost().findChildren();
			if (container == null || container.length == 0)
				{
					System.out.println("容器不为空");
					//tomcat.addWebapp("", homeDir + "/" + "server" + "/" + "webapps");
					tomcat.addWebapp("", homeDir + "/" + "src/main/webapp");
				}
			    tomcat.getConnector().setURIEncoding("UTF-8");
				tomcat.getConnector().setUseBodyEncodingForURI(true);
				tomcat.getConnector().setProtocol("HTTP/1.1");
				tomcat.getConnector().setRedirectPort(8888);
				tomcat.start();
				tomcat.getServer().await();	
				
			} catch (LifecycleException e) {
				e.printStackTrace();
			} catch (ServletException e) {
				e.printStackTrace();
		   }
	}

	public void run() {
		System.out.println("开始了");
		StartTomcat();
	}
		//打开指定的url地址网页
			public static  void openURL(String url) {
					String osName = System.getProperty("os.name");
					try {	
					if (osName.startsWith("Windows")) {
							Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + url);
					} else {	
					}
				} catch (Exception ex) {
					ex.printStackTrace();
			}
	}

		public static void main(String args[]){
			  
			Socket skt=new Socket();
				try {
					skt.bind(new InetSocketAddress("localhost", 8888));
					skt.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
				TomcatServer ts=new TomcatServer();
				ts.start();
				//打开页面方式最好是如下所写
				openURL("http://localhost:15435/");

			
			
		}
}
