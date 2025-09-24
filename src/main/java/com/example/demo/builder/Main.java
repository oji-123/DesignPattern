package com.example.demo.builder;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		} else if (args[0].equals("text")) {
			var textBuilder = new TextBuilder();
			var director = new Director(textBuilder);
			director.construct();
			String result = textBuilder.getTextResult();
			System.out.println(result);
		} else if (args[0].equals("html")) {
			var htmlBuilder = new HTMLBuilder();
			var director = new Director(htmlBuilder);
			director.construct();
			String result = htmlBuilder.getHTMLResult();
			System.out.println("HTMLファイル：" + result + "が作成されました。");
		} else {
			usage();
			System.exit(0);
		}
	}

	private static void usage() {
		System.out.println("Usage: java Main text → テキストで文書作成");
		System.out.println("Usage: java Main html → HTMLで文書作成");
	}
}
