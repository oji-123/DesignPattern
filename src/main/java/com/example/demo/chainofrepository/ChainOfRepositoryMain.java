package com.example.demo.chainofrepository;

public class ChainOfRepositoryMain {

	public static void main(String[] args) {
		Support alice = new NoSupport("Alice");
		Support bob = new LimitSupport("Bob", 100);
		Support charile = new SpecialSupport("Charile", 429);
		Support daina = new LimitSupport("Daina", 200);
		Support elmo = new OddSupport("Elmo");
		Support fred = new LimitSupport("Fred", 300);

		alice.setNext(bob).setNext(charile).setNext(daina).setNext(elmo).setNext(fred);

		for (int i = 0; i < 500; i += 33) {
			alice.support(new Trouble(i));
		}
	}
}
