package com.example.demo.chainofrepository;

public abstract class Support {
	private String name;
	private Support next; // たらい回しにする先

	public Support(String name) {
		this.name = name;
		this.next = null;
	}

	// たらい回し先を決定する
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}

	// トラブル解決の手順を定める
	public void support(Trouble trouble) {
		if (resolve(trouble)) {
			done(trouble);
		} else if (next != null) {
			next.support(trouble);
		} else {
			fail(trouble);
		}
	}

	// トラブル解決者の文字列表現
	@Override
	public String toString() {
		return "[" + name + "]";
	}

	protected abstract boolean resolve(Trouble trouble);

	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + ".");
	}

	protected void fail(Trouble trouble) {
		System.out.println(trouble + " can not resolved.");
	}
}
