package com.example.demo.strategy;

public enum Hand {
	// じゃんけんの手を表す
	ROCK("グー", 0), SCISSORS("チョキ", 1), PAPER("パー", 2);

	// enumが持つフィールド
	private String name; // じゃんけんの手の名前
	private int handValue;

	// 手の値から定数を取得するための配列
	private static Hand[] hands = { ROCK, SCISSORS, PAPER };

	// コンストラクタ
	private Hand(String name, int handValue) {
		this.name = name;
		this.handValue = handValue;
	}

	// 手の値からenum定数を取得
	public static Hand getHand(int handValue) {
		return hands[handValue];
	}

	// 自身が受け取った引数よりも強い場合
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}

	// 自身が受け取った引数よりも弱い場合
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}

	// 引き分けは0, 自身の勝ちなら1, hの勝ちなら-1
	private int fight(Hand h) {
		if (this == h) {
			return 0;
		} else if ((this.handValue + 1) % 3 == h.handValue) {
			return 1;
		} else {
			return -1;
		}
	}

	// じゃんけんの「手」の文字列表現
	@Override
	public String toString() {
		return name;
	}
}
