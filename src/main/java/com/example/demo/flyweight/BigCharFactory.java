package com.example.demo.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
	// 既に作ったBigCharのインスタンスを保持
	private Map<String, BigChar> pool = new HashMap<>();

	//	Singletonパターン
	private static BigCharFactory singleton = new BigCharFactory();

	// コンストラクタ
	private BigCharFactory() {
	}

	// 唯一のインスタンスを得る
	public static BigCharFactory getInstance() {
		return singleton;
	}

	//	BigCharのインスタンスを生成(共有)
	public synchronized BigChar getBigChar(char charName) {
		BigChar bc = pool.get(String.valueOf(charName));
		if (bc == null) {
			// ここでBigCharのインスタンスを生成
			bc = new BigChar(charName);
			pool.put(String.valueOf(charName), bc);
		}

		return bc;
	}
}
