package com.example.demo.chainofrepository;

public class OddSupport extends Support {

	public OddSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		// 奇数の番号のものは解決
		if (trouble.getNumber() % 2 == 1) {
			return true;
		}

		return false; // 偶数の場合は、処理を行わない
	}
}
