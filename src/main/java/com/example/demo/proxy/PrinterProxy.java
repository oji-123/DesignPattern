package com.example.demo.proxy;

public class PrinterProxy implements Printable {
	private String name;
	private Printer real;

	// コンストラクタ
	public PrinterProxy() {
		this.name = "No name";
		this.real = null;
	}

	// コンストラクタ(名前指定)
	public PrinterProxy(String name) {
		this.name = name;
		this.real = null;
	}

	@Override
	public synchronized void setPrinterName(String name) {
		if (real != null) {
			// 本人にも設定
			real.setPrinterName(name);
		}
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return this.name;
	}

	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}

	private synchronized void realize() {
		if (this.real == null) {
			this.real = new Printer(this.name);
		}
	}
}
