package com.example.demo.templatemethod;

public class CharDisplay implements AbstractDisplay {
	private char ch;

	// コンストラクタ
	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
		// 開始文字「<<」を出力
		System.out.print("<<");
	}

	@Override
	public void print() {
		// フィールドに保存しておいた文字を1回表示
		System.out.print(ch);
	}

	@Override
	public void close() {
		// 終了文字「>>」を出力
		System.out.println(">>");
	}
}
