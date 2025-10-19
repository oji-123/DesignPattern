package com.example.demo.decoraor;

public class FullBorder extends Border {

	protected FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		// 行数は中身の行数に上下の飾り文字分を加えたもの
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowsText(int row) {
		if (row == 0) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else if (row == display.getRows() + 1) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else {
			return "|" + display.getRowsText(row - 1) + "|";
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
