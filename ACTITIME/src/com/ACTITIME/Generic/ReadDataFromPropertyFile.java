package com.ACTITIME.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	

	public String ReadDataFromProperty(String Key) throws IOException {
	FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(Key);
	return value;
	}
}
