package com.example.demo.decoraor;

public class StringDisplay extends Display {

	private String string;

	public StringDisplay(String string) {
		this.string = string;
	}

	@Override
	public int getColumns() {
		return string.length();
	}

	@Override
	public int getRows() {
		return 1; // 行数は固定で1
	}

	@Override
	public String getRowsText(int row) {
		if (row != 0) {
			throw new IndexOutOfBoundsException();
		}
		return string;
	}

}
