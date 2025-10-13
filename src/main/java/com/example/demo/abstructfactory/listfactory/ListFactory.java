package com.example.demo.abstructfactory.listfactory;

import com.example.demo.abstructfactory.factory.Factory;
import com.example.demo.abstructfactory.factory.Link;
import com.example.demo.abstructfactory.factory.Page;
import com.example.demo.abstructfactory.factory.Tray;

public class ListFactory extends Factory {
	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}
}
