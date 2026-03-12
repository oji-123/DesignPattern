package com.example.demo.flyweight;

import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
	// 文字の名前
	private char charName;
	// 大きな文字を表現する文字列
	private String fontData;

	// コンストラクタ
	public BigChar(char charName) {
		this.charName = charName;
		try {
			String fileName = "big" + this.charName + ".txt";
			StringBuilder sb = new StringBuilder();
			for (String line : Files.readAllLines(Path.of(fileName))) {
				sb.append(line);
				sb.append("\n");
			}
			this.fontData = sb.toString();
		} catch (Exception e) {
			this.fontData = charName + "?";
		}
	}

	// 大きな文字を表示する
	public void print() {
		System.out.print(fontData);
	}
}
