package com.example.demo.adapter.question;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {

	// プロパティ保持用マップ
	Properties properties = new Properties();

	String baseDirPath = "C:\\\\Users\\\\PC_User\\\\Desktop\\\\adapter\\\\";

	@Override
	public void readFromFile(String fileName) throws IOException {
		properties.load(new FileReader(baseDirPath + fileName));
	}

	@Override
	public void writeToFile(String fileName) throws IOException {
		properties.store(new FileWriter(baseDirPath + fileName), "written by FileProperties");
	}

	@Override
	public void setValue(String key, String value) throws IOException {

		if (key == null || key.isEmpty()) {
			throw new IOException("Keyの値が未定義です。");
		}

		if (value == null || value.isEmpty()) {
			throw new IOException("Valueの値が未定義です。");
		}

		properties.setProperty(key, value);
	}

	@Override
	public String getValue(String key) throws IOException {
		String returnValue = properties.getProperty(key);

		if (returnValue == null || returnValue.isEmpty()) {
			throw new IOException("プロパティが未定義です。");
		}

		return returnValue;
	}
}
