package com.example.demo.builder;

public class Director {
	private Builder builder;

	// コンストラクタ
	public Director(Builder builder) {
		this.builder = builder;
	}

	// 文書を作るクラス
	public void construct() {
		builder.makeTitle("fluit");
		builder.makeString("果物の一覧");
		builder.makeItems(new String[] { "banana", "apple", "grape" });
		builder.makeString("変わった果物");
		builder.makeItems(new String[] { "cranberry", "lime", "olive" });
		builder.close();
	}
}
