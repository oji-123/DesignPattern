package com.example.demo.chainofrepository;

public class SpecialSupport extends Support {

	private int number;

	public SpecialSupport(String name, int number) {
		super(name);
		this.number = number;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() == number) {
			return true;
		}
		return false; // 指定番号以外は解決しない
	}
}
