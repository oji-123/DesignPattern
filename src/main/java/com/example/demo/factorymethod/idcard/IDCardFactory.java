package com.example.demo.factorymethod.idcard;

import com.example.demo.factorymethod.framework.Factory;
import com.example.demo.factorymethod.framework.Product;

public class IDCardFactory extends Factory {

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		System.out.println(product + "を登録しました。");
	}
}
