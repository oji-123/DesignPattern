package com.example.demo.visitor;

public abstract class Entry implements Element {
	// 名前取得
	public abstract String getName();

	// サイズ取得
	public abstract int getSize();

	// 文字表現
	@Override
	public String toString() {
		return getName() + "(" + getSize() + ")";
	}
}
