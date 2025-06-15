package com.example.demo.templatemethod;

public abstract class AbstractDisplay {
	protected abstract void open();

	protected abstract void print();

	protected abstract void close();

	// 5回出力することは固定
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
