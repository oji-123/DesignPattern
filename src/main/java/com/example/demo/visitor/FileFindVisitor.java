package com.example.demo.visitor;

import java.util.ArrayList;
import java.util.List;

public class FileFindVisitor extends Visitor {

	// 現在注目しているディレクトリ名
	private String currentDir = "";

	// 対象のファイル格納用変数
	List<Entry> foundFiles = new ArrayList<>();

	// 対象の拡張子
	private String targetExtension = "";

	public FileFindVisitor(String targetExtension) {
		this.targetExtension = targetExtension;
	}

	// Fileクラス訪問時
	@Override
	public void visit(File file) {
		// 拡張子「html」を収集
		if (file.getName().endsWith(targetExtension)) {
			this.foundFiles.add(file);
		}
	}

	// Directoryクラス訪問時
	@Override
	public void visit(Directory directory) {
		//		System.out.println(currentDir + "/" + directory);
		String saveDir = currentDir;
		currentDir = currentDir + "/" + directory.getName();
		for (Entry entry : directory) {
			entry.accept(this);
		}
		currentDir = saveDir;
	}

	public List<Entry> getFoundFiles() {
		return this.foundFiles;
	}
}
