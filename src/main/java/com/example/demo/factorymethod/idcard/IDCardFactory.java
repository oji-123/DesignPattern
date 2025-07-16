package com.example.demo.factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.factorymethod.framework.Factory;
import com.example.demo.factorymethod.framework.Product;

public class IDCardFactory extends Factory {

	private List<IDCard> cardList = new ArrayList<>();

	@Override
	protected Product createProduct(String owner) {

		// 次に発行するカードの連番を取得
		int idCardNextNum = cardList.size() + 1;

		IDCard idCard = new IDCard(idCardNextNum, owner);
		cardList.add(idCard);
		return idCard;
	}

	@Override
	protected void registerProduct(Product product) {
		System.out.println(product + "を登録しました。");
	}
}
