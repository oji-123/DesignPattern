package com.example.demo.observer;

public class HyphenObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:");
		int count = generator.getNumber();
		for (int i = 0; i < count; i++) {
			System.out.print("-");
		}
		System.out.println("");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}
