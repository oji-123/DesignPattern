package com.example.demo.abstructfactory.factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
	protected String title;
	protected String author;
	protected List<Item> content = new ArrayList<Item>();

	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void add(Item item) {
		content.add(item);
	}

	public void output(String fileName) {
		try {
			Files.writeString(Path.of(fileName), makeHTML(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
			System.out.println(fileName + "を作成しました。");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public abstract String makeHTML();
}
