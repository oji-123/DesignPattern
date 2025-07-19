package com.example.demo.singleton.question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {

	private static Map<String, Triple> map = new HashMap<>();

	static {
		String[] names = { "ALPHA", "BETA", "GAMMA" };
		Arrays.stream(names).forEach(s -> map.put(s, new Triple()));

	}

	private Triple() {
		System.out.println("インスタンスを生成しました。");
	}

	// name, インスタンスでMapで持っても良い。
	public Triple getInstance(String name) throws Exception {
		return map.get(name);
	}
}
