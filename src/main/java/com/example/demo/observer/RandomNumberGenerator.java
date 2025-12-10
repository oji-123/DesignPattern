package com.example.demo.observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
	// 乱数生成用
	private Random random = new Random();
	// 現在の数
	private int number;

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void execute() {
		for (int i = 0; i < 20; i++) {
			number = random.nextInt(50);
			notifyObservers();
		}
	}
}
