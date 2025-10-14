package com.example.demo.strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
	private Random random;
	private int prevHnadValue = 0;
	private int currentHnadValue = 0;

	private int[][] history = {
			{ 1, 1, 1 },
			{ 1, 1, 1 },
			{ 1, 1, 1 }
	};

	public ProbStrategy(int seed) {
		this.random = new Random(seed);
	}

	@Override
	public Hand nextHand() {
		int bet = random.nextInt(getSum(currentHnadValue));
		int handValue = 0;
		if (bet < history[currentHnadValue][0]) {
			handValue = 0;
		} else if (bet < history[currentHnadValue][0] + history[currentHnadValue][1]) {
			handValue = 1;
		} else {
			handValue = 2;
		}
		prevHnadValue = currentHnadValue;
		currentHnadValue = handValue;
		return Hand.getHand(handValue);
	}

	private int getSum(int handValue) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += history[handValue][i];
		}
		return sum;
	}

	@Override
	public void study(boolean win) {
		if (win) {
			history[prevHnadValue][currentHnadValue]++;
		} else {
			history[prevHnadValue][(currentHnadValue + 1) % 3]++;
			history[prevHnadValue][(currentHnadValue + 2) % 3]++;
		}
	}
}
