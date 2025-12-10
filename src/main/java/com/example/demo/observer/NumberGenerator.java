package com.example.demo.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
	// 保持するObserver
	private List<Observer> observers = new ArrayList<>();

	// Observerを追加する
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	// Observerを削除する
	public void deleteObserver(Observer observer) {
		this.observers.remove(observer);
	}

	// Observerへ通知する
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(this);
		}
	}

	// 数の取得
	public abstract int getNumber();

	// 数を生成する
	public abstract void execute();
}
