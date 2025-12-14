package com.example.demo.memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Memento {
	private int money;
	private List<String> fruits;
	private int number;

	// 所持金を得る(narrow interface)
	public int getMoney() {
		return money;
	}

	// 数字を得る
	int getNumber() {
		return number;
	}

	// 数字を変更する(乱数)
	// 数字を得る
	private void setNumber() {
		number = new Random().nextInt(100);
	}

	// コンストラクタ(wide interface)
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList<String>();
		setNumber();
	}

	// フルーツを追加する(wide interface)
	void addFruit(String fruit) {
		fruits.add(fruit);
	}

	// フルーツを得る(wide interface)
	List<String> getFruits() {
		return new ArrayList<String>(fruits);
	}
}
