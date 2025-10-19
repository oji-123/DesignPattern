package com.example.demo.decoraor;

public class DecoratorMain {
	public static void main(String[] args) {
		Display b1 = new StringDisplay("Hello, world.");
		Display b2 = new SideBorder(b1, '#');
		Display b3 = new FullBorder(b2);
		b1.show();
		b2.show();
		b3.show();

		Display b4 = new SideBorder(
				new FullBorder(
						new UpDownBorder(
								new FullBorder(
										new UpDownBorder(
												new StringDisplay("Hello, test"),
												'=')),
								'*')),
				'/');

		b4.show();

		Display b5 = new UpDownBorder(b1, '$');
		b5.show();
	}
}
