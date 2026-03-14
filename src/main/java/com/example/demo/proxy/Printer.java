package com.example.demo.proxy;

public class Printer implements Printable {

	// 名前
	private String name;

	// コンストラクタ
	public Printer() {
		heavyJob("Printerのインスタンス生成中");
	}

	// コンストラクタ(名前指定)
	public Printer(String name) {
		this.name = name;
		heavyJob("Printerのインスタンス(" + name + ")を生成中");
	}

	@Override
	public void setPrinterName(String name) {
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return this.name;
	}

	@Override
	public void print(String string) {
		System.out.println("===" + this.name + "===");
		System.out.println(string);
	}

	private void heavyJob(String msg) {
		System.out.println(msg);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.print(".");
		}
		System.out.println("完了");
	}
}
