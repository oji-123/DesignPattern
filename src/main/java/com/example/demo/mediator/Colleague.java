package com.example.demo.mediator;

public interface Colleague {
	// Mediatorを指定する
	public abstract void setMediator(Mediator mediator);

	// Mediatorから有効/無効の切り替えを行う
	public abstract void setColleagueEnable(boolean enabled);
}
