package com.example.demo.decoraor;

public class SideBorder extends Border {

	private char borderChar; // 飾り文字

	// 中身として扱うDisplayと飾り文字を指定
	public SideBorder(Display display, char ch) {
		super(display);
		this.borderChar = ch;
	}

	@Override
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		// 行数は中身の行数と同じ
		return display.getRows();
	}

	@Override
	public String getRowsText(int row) {
		// 指定業の内容は、中身の指定業の両側に飾り文字を追加したもの
		return borderChar + display.getRowsText(row) + borderChar;
	}
}
