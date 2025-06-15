package com.example.demo.templatemethod;

public class TemplateMethodMain {
	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello World");

		d1.display();
		d2.display();
	}
}
