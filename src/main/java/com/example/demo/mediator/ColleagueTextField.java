package com.example.demo.mediator;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {

	private Mediator mediator;

	public ColleagueTextField(String text, int colmuns) {
		super(text, colmuns);
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnable(boolean enabled) {
		setEnabled(enabled);
		// 有効/無効に合わせて背景色を変更
		setBackground(enabled ? Color.white : Color.lightGray);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		// 文字列が変化したら、Mediatorに通知
		mediator.colleaguesChanged();
	}
}
