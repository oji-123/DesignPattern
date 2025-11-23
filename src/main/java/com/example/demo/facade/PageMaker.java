package com.example.demo.facade;

import java.io.FileWriter;
import java.util.Properties;

public class PageMaker {
	private PageMaker() {
		// 何もしない
	}

	public static void makeWelcomePage(String mailaddr, String filename) {
		try {
			Properties mailProp = Database.getProperties("maildata");
			String userName = mailProp.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title(userName + "'s web page");
			writer.paragraph("Welcome to " + userName + "'s web page!");
			writer.paragraph("Nice to meet you!");
			writer.mailTo(mailaddr, userName);
			writer.close();
			System.out.println(filename + " is created for " + mailaddr + " (" + userName + ")");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
