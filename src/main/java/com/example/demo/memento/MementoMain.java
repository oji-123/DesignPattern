package com.example.demo.memento;

import com.example.demo.memento.game.Gamer;
import com.example.demo.memento.game.Memento;

public class MementoMain {
	public static void main(String[] args) {
		// 最初の所持金は100
		Gamer gamer = new Gamer(100);
		// 初期状態を保存
		Memento memento = gamer.createMemento();

		// ゲームスタート
		for (int i = 0; i < 100; i++) {
			System.out.println("==== " + i);
			System.out.println("現状:" + gamer);

			// ゲームを進める
			gamer.bet();

			System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

			// Mementoの取り扱いを決定
			if (gamer.getMoney() > memento.getMoney()) {
				System.out.println("※だいぶ増えてきたので、現在の状態を保存しておこう！");
				memento = gamer.createMemento();
			} else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("※だいぶ増えてきたので、現在の状態を保存しておこう！");
				gamer.restoreMemento(memento);
			}

			// 時間待ち
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println();

		}
	}
}
