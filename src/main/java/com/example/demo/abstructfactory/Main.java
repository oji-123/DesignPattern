package com.example.demo.abstructfactory;

import com.example.demo.abstructfactory.factory.Factory;
import com.example.demo.abstructfactory.factory.Link;
import com.example.demo.abstructfactory.factory.Page;
import com.example.demo.abstructfactory.factory.Tray;

public class Main {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("引数の数が不正です");
			System.exit(0);
		}

		String fileName = args[0];
		String className = args[1];

		Factory factory = Factory.getFactory(className);

		// Blog
		Link blog1 = factory.createLink("Blog 1", "http://example.com/blog1");
		Link blog2 = factory.createLink("Blog 2", "http://example.com/blog2");
		Link blog3 = factory.createLink("Blog 3", "http://example.com/blog3");

		Tray blogTray = factory.createTray("Blog Site");
		blogTray.add(blog1);
		blogTray.add(blog2);
		blogTray.add(blog3);

		// News
		Link news1 = factory.createLink("News 1", "http://example.com/news1");
		Link news2 = factory.createLink("News 2", "http://example.com/news1");
		Tray news3 = factory.createTray("News 3");
		news3.add(factory.createLink("News 3(US)", "http://example.com/news3us"));
		news3.add(factory.createLink("News 3(Japan)", "http://example.com/news3jp"));

		Tray newsTray = factory.createTray("News Site");
		newsTray.add(news1);
		newsTray.add(news2);
		newsTray.add(news3);

		// Page
		Page page = factory.createPage("Blog and News", "Hiroshi Yuki");
		page.add(blogTray);
		page.add(newsTray);

		page.output(fileName);
	}
}
