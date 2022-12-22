package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readConfig {
	
	Properties pro;
	public readConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		pro = new Properties();
		FileInputStream fi;
		try {
			fi = new FileInputStream(src);
			pro.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getUrl() {
		String url = pro.getProperty("url");
		return url;
	}
	

}
