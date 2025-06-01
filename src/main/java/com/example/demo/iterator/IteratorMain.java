/**
 * 
 */
package com.example.demo.iterator;

public class IteratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("A book"));
		bookShelf.appendBook(new Book("B book"));
		bookShelf.appendBook(new Book("C book"));
		bookShelf.appendBook(new Book("D book"));

		// 明示的にIteratorを利用して実装
		Iterator<Book> it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
	}
}
