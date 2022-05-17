package com.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {

	public static Properties pro = pro();

	public static String getBrowser() {

		return pro.getProperty("browser1");
//		return pro.getProperty("browser2");

	}

	public static String getUrl() {

		return pro.getProperty("url");

	}

	public static Properties pro() {

		try {
			File file = new File(
					"C:\\Users\\maharajan_k\\eclipse-workspace\\demoblaze\\src\\main\\java\\demoblaze\\properties\\property");
			FileInputStream read = new FileInputStream(file);

			pro = new Properties();
			pro.load(read);

		} catch (FileNotFoundException e) {

			System.out.println(e);

		} catch (IOException e) {

			System.out.println(e);
		}
		return pro;
	}

}
