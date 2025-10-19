package com.example.demo.decoraor;

public class UpDownBorder extends Border {

	private char upDownChar; // 飾り文字

	// 中身として扱うDisplayと飾り文字を指定
	public UpDownBorder(Display display, char ch) {
		super(display);
		this.upDownChar = ch;
	}

	@Override
	public int getColumns() {
		return display.getColumns();
	}

	@Override
	public int getRows() {
		// 行数が上下の2行増える
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowsText(int row) {
		// 指定業の内容は、中身の指定業の両側に飾り文字を追加したもの
		if (row == 0) {
			return makeLine(upDownChar, display.getColumns());
		} else if (row == display.getRows() + 1) {
			return makeLine(upDownChar, display.getColumns());
		} else {
			return display.getRowsText(row - 1);
		}
	}

	private String makeLine(char ch, int count) {
		var line = new StringBuilder();
		for (int i = 0; i < count; i++) {
			line.append(ch);
		}
		return line.toString();
	}
}
