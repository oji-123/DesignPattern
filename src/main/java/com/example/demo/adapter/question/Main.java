package com.example.demo.adapter.question;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("file.txt");
			//	System.out.println(f.getValue("width")); // 確認用
			f.setValue("width", "1024");
			f.setValue("height", "512");
			f.setValue("depth", "32");
			f.writeToFile("newfile.txt");
			System.out.println("newfile.txt is created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
