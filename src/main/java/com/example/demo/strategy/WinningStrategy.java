package com.example.demo.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {

	private Random random;
	private boolean won;
	private Hand prevHnad;

	public WinningStrategy(int seed) {
		this.random = new Random(seed);
	}

	@Override
	public Hand nextHand() {
		if (!won) {
			this.prevHnad = Hand.getHand(random.nextInt(3));
		}
		return prevHnad;
	}

	@Override
	public void study(boolean win) {
		this.won = win;
	}
}
