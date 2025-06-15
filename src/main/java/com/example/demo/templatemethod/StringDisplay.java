package com.example.demo.templatemethod;

public class StringDisplay implements AbstractDisplay {
	private String string;
	private int width;

	// コンストラクタ
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.length();
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		// フィールドに保存しておいた文字を1回表示
		System.out.println("|" + string + "|");
	}

	@Override
	public void close() {
		printLine();
	}

	// 横ライン出力用メソッド
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < this.width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
