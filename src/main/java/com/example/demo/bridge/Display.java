package com.example.demo.bridge;

public class Display {
	private DisplayImpl impl;

	public Display(DisplayImpl impl) {
		this.impl = impl;
	}

	public void open() {
		impl.rowOpen();
	}

	public void print() {
		impl.rowPrint();
	}

	public void close() {
		impl.rowClose();
	}

	public final void display() {
		open();
		print();
		close();
	}
}
