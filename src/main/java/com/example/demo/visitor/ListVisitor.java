package com.example.demo.visitor;

public class ListVisitor extends Visitor {

	// 現在注目しているディレクトリ名
	private String currentDir = " ";

	// Fileクラス訪問時
	@Override
	public void visit(File file) {
		System.out.println(currentDir + "/" + file);
	}

	// Directoryクラス訪問時
	@Override
	public void visit(Directory directory) {
		System.out.println(currentDir + "/" + directory);
		String saveDir = currentDir;
		currentDir = currentDir + "/" + directory.getName();
		for (Entry entry : directory) {
			entry.accept(this);
		}
		currentDir = saveDir;
	}

}
