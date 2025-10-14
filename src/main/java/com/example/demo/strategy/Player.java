package com.example.demo.strategy;

public class Player {
	private String name;
	private Strategy strategy;
	private int winCount;
	private int loseCount;
	private int gameCount;

	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}

	// 与えられた戦略を元に次の手を決める
	public Hand nextHand() {
		return strategy.nextHand();
	}

	// 勝った
	public void win() {
		winCount++;
		gameCount++;
	}

	// 負けた
	public void lose() {
		loseCount++;
		gameCount++;
	}

	// 引き分けた
	public void even() {
		gameCount++;
	}

	@Override
	public String toString() {
		return "[" + name + ":" + gameCount + "games, " + winCount + "win, " + loseCount + "lose]";
	}
}
