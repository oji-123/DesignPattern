package com.example.demo.factorymethod;

import com.example.demo.factorymethod.framework.Factory;
import com.example.demo.factorymethod.framework.Product;
import com.example.demo.factorymethod.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Hiroshi Yuki");
		Product card2 = factory.create("Tomura");

		card1.use();
		card2.use();
	}

}
