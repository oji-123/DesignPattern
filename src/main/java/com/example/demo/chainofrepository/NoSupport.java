package com.example.demo.chainofrepository;

public class NoSupport extends Support {

	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return false; // 自身は何も解決の処理を行わない
	}
}
