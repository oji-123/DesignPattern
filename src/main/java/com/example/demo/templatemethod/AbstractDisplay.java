package com.example.demo.templatemethod;

public abstract interface AbstractDisplay {
	void open();

	void print();

	void close();

	// 5回出力することは固定
	public default void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
