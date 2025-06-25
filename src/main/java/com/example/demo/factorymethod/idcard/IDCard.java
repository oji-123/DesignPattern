package com.example.demo.factorymethod.idcard;

import com.example.demo.factorymethod.framework.Product;

public class IDCard extends Product {
	private String owner;

	public IDCard(String owner) {
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(this + "を使います。");
	}

	@Override
	public String toString() {
		return "[IDCard:" + this.owner + "]";
	}

	public String getOwner() {
		return this.owner;
	}
}
