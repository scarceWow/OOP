

import java.util.ArrayList;

public class Borrower {
    public String name;
	public ArrayList<Book> borrowedBooks = new ArrayList<Book>(); //buat nyinmpen array secara dynamic

	public Borrower(String name) {
		this.name = name;
	}
	
	public void borrowBook(Book book) {
		borrowedBooks.add(book);
	}
	
	public void returnBook(Book book) {
		borrowedBooks.remove(book);
	}
	
	public void displayBorrowedBooks() {
		System.out.println(name + "'s Borrowed Books: ");
		for (Book book : borrowedBooks) {
			System.out.println("Title: " + book.title);
			System.out.println("ISBN: " + book.isbn);
			System.out.println("Author: " + book.author.name);
			System.out.println("Biography: " + book.author.biography);
			System.out.println("----------------------------------");
		}
	}
}
