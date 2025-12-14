package com.example.demo.memento.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
	private int money;
	private List<String> fruits;

	// 所持金を得る(narrow interface)
	public int getMoney() {
		return money;
	}

	// コンストラクタ(wide interface)
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList<String>();
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
