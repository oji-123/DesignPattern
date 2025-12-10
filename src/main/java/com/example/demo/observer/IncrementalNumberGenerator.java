package com.example.demo.observer;

public class IncrementalNumberGenerator extends NumberGenerator {
	// 現在の数
	private int number;
	// 現在の数
	private int startNum;
	// 現在の数
	private int endNum;
	// 現在の数
	private int incrementNum;

	public IncrementalNumberGenerator(int startNum, int endNum, int incrementNum) {
		this.startNum = startNum;
		this.endNum = endNum;
		this.incrementNum = incrementNum;
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void execute() {
		for (int i = startNum; i < endNum; i += incrementNum) {
			this.number = i;
			notifyObservers();
		}
	}
}
