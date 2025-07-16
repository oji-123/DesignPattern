package com.example.demo.singleton.question;

public class Triple {
	private Triple alpha = new Triple();
	private Triple beta = new Triple();
	private Triple gamma = new Triple();

	private Triple() {
		System.out.println("インスタンスを生成しました。");
	}

	// name, インスタンスでMapで持っても良い。
	public Triple getInstance(String name) throws Exception {
		if (name.equals("alpha")) {
			return alpha;
		} else if (name.equals("beta")) {
			return beta;
		} else if (name.equals("gamma")) {
			return gamma;
		}

		// 上記以外はエラー
		throw new Exception("インスタンスの指定名が不正です。");
	}
}
