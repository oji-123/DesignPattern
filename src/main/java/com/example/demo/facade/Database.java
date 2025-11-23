package com.example.demo.facade;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {
	private Database() {
		// 何もしない
	}

	// データべース名からプロパティを取得する
	public static Properties getProperties(String dbname) throws IOException {
		String fileName = dbname + ".txt";
		Properties prop = new Properties();
		prop.load(new FileReader(fileName));
		return prop;
	}
}
