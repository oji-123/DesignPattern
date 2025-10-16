package com.example.demo.composite;

public abstract class Entry {
	// 名前取得
	public abstract String getName();

	// サイズ取得
	public abstract int getSize();

	// 一覧を表示する
	public void printList() {
		printList(" ");
	}

	// prefixを先頭につけて、一覧に表示する
	protected abstract void printList(String prefix);

	// 文字表現
	@Override
	public String toString() {
		return getName() + "(" + getSize() + ")";
	}
}
