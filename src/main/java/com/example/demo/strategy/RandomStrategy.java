package com.example.demo.strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {
	private Random random;
	private Hand prevHnad;

	public RandomStrategy(int seed) {
		this.random = new Random(seed);
	}

	@Override
	public Hand nextHand() {
		this.prevHnad = Hand.getHand(random.nextInt(3));
		return prevHnad;
	}

	@Override
	public void study(boolean win) {
		// NOP
	}
}
