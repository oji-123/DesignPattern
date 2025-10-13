package com.example.demo.bridge;

import java.util.Random;

public class RandamDisplay extends Display {
	public RandamDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void randamDisplay() {
		open();

		Random rand = new Random();
		int count = rand.nextInt(10);
		for (int i = 0; i < count; i++) {
			print();
		}

		close();
	}
}
