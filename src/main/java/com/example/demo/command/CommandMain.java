package com.example.demo.command;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.example.demo.command.drawer.DrawCanvas;
import com.example.demo.command.drawer.DrawCommand;

public class CommandMain extends JFrame implements MouseMotionListener, WindowListener {

	// 描画履歴
	private MacroCommand history = new MacroCommand();
	//	描画履歴
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);

	//	消去ボタン
	private JButton clearButton = new JButton("clear");

	//	コンストラクタ
	public CommandMain(String title) {
		super(title);

		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(e -> {
			history.clear();
			canvas.repaint();
		});

		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);

		pack();
		setVisible(true);
	}

	//	MouseMotionListener用
	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Command cmd = new DrawCommand(canvas, e.getPoint());
		history.append(cmd);
		cmd.execute();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	//	
	public static void main(String[] args) {
		new CommandMain("Command Pattern Sample");
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}
}
