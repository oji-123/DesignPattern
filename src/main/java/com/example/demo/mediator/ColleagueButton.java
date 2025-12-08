package com.example.demo.mediator;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {

	private Mediator mediator;

	public ColleagueButton(String caption) {
		super(caption);
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnable(boolean enabled) {
		setEnabled(enabled);
	}
}
