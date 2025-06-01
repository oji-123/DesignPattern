package com.example.demo.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Iteratable<Book> {
	// 最大容量を最初に決定しない
	public List<Book> books;

	// コンストラクタでは、最初に最大許容数を指定しない
	public BookShelf(int initialize) {
		this.books = new ArrayList<Book>(initialize);
	}

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public void appendBook(Book book) {
		// 追加の方法をArrayListの方法に変更
		this.books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}
}
