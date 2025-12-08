package com.example.demo.mediator;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {

	private ColleagueCheckBox checkGuest;
	private ColleagueCheckBox checkLogin;
	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;

	public LoginFrame(String title) {
		super(title);

		// 背景色の設定
		setBackground(Color.lightGray);

		// レイアウトマネージャを使って4×2のグリッドを生成
		setLayout(new GridLayout(4, 2));

		// Colleagueたちの生成
		createColleagues();

		// 部品の配置を決める
		add(checkGuest);
		add(checkLogin);
		add(new Label("User Name :"));
		add(textUser);
		add(new Label("Password :"));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);

		// 有効/無効の初期設定を行う
		colleaguesChanged();

		// 表示する
		pack();
		setVisible(true);
	}

	@Override
	public void createColleagues() {
		// CheckBox
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckBox("Guest", g, true);
		checkLogin = new ColleagueCheckBox("Login", g, false);

		// TextField
		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*');

		// Button
		buttonOk = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");

		// Mediatorの設定
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);

		// Listnerのセット
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
	}

	@Override
	public void colleaguesChanged() {
		if (checkGuest.getState()) {
			// ゲストログイン
			textUser.setColleagueEnable(false);
			textPass.setColleagueEnable(false);
			buttonOk.setColleagueEnable(true);
		} else {
			// ユーザログイン
			textUser.setColleagueEnable(true);
			userpassChanged();
		}
	}

	private void userpassChanged() {
		if (textUser.getText().length() > 0) {
			textPass.setColleagueEnable(true);
			if (textPass.getText().length() > 0) {
				buttonOk.setColleagueEnable(true);
			} else {
				buttonOk.setColleagueEnable(false);
			}
		} else {
			textPass.setColleagueEnable(false);
			buttonOk.setColleagueEnable(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		System.exit(0);
	}

}
