package com.configuration;

public class File_Reader_Manager {

	private File_Reader_Manager() {
	}

	public static Config_Reader getInstanceCR() {

		Config_Reader config = new Config_Reader();
		return config;

	}
}
