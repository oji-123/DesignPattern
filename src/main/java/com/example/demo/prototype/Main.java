package com.example.demo.prototype;

public class Main {

	public static void main(String[] args) {
		// インスタンスの準備
		Manager manager = new Manager();
		UnderlinePen baseUpen = new UnderlinePen('-');
		MessageBox baseMbox = new MessageBox('*');
		MessageBox baseSbox = new MessageBox('/');

		UnderlinePen upen = (UnderlinePen) baseUpen.createCopy();
		MessageBox mbox = (MessageBox) baseMbox.createCopy();
		MessageBox sbox = (MessageBox) baseSbox.createCopy();

		// インスタンスの登録
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("srash box", sbox);

		// インスタンスの取得と実行
		Product p1 = manager.create("strong message");
		p1.use("Hello World");

		Product p2 = manager.create("warning box");
		p2.use("Hello World");

		Product p3 = manager.create("srash box");
		p3.use("Hello World");
	}
}
