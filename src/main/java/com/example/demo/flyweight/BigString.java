package com.example.demo.flyweight;

public class BigString {
	//	大きな文字の配列
	private BigChar[] bigChars;

	// コンストラクタ
	public BigString(String string) {
		BigCharFactory factory = BigCharFactory.getInstance();
		bigChars = new BigChar[string.length()];
		for (int i = 0; i < bigChars.length; i++) {
			bigChars[i] = factory.getBigChar(string.charAt(i));
		}
	}

	// 表示
	public void print() {
		for (BigChar bc : bigChars) {
			bc.print();
		}
	}
}
