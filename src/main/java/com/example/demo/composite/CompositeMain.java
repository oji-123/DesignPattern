package com.example.demo.composite;

public class CompositeMain {
	public static void main(String[] args) {

		Directory rootDir = new Directory("root");
		Directory usrDir = new Directory("usr");

		rootDir.add(usrDir);
		usrDir.add(new File("vi", 10000));

		Directory yuki = new Directory("yuki");
		usrDir.add(yuki);

		yuki.add(new File("diary.html", 100));

		rootDir.printList();
	}
}
