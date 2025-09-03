package com.example.demo.prototype;

public class UnderlinePen extends Product {
	private char ulchar;

	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	public UnderlinePen(UnderlinePen prototype) {
		this.ulchar = prototype.ulchar;
	}

	@Override
	public void use(String s) {
		int ulen = 1 + s.length() + 1;
		System.out.println(s);
		for (int i = 0; i < ulen; i++) {
			System.out.print(ulchar);
		}
		System.out.println();
	}

	@Override
	public Product createCopy() {
		return new UnderlinePen(this);
	}
}
