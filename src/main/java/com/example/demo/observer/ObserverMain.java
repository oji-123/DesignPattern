package com.example.demo.observer;

public class ObserverMain {

	public static void main(String[] args) {
		//		NumberGenerator generator = new RandomNumberGenerator();
		//		Observer observer1 = new DigitObserver();
		//		Observer observer2 = new GraphObserver();
		//		generator.addObserver(observer1);
		//		generator.addObserver(observer2);
		//		generator.execute();

		NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		Observer observer3 = new HyphenObserver();
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		generator.addObserver(observer3);
		generator.execute();
	}
}
