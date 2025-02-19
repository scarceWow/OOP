import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books = new ArrayList<>();
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added to library: " + book.title);
	}
	
	public void borrowBook(Borrower borrower, Book book) {
		books.remove(book);
		borrower.borrowBook(book);
		System.out.println(borrower.name + " borrowed: " + book.title);
	}

	
	public void returnBook(Borrower borrower, Book book) {
		borrower.returnBook(book);
		books.add(book);
		System.out.println(borrower.name + " returned: " + book.title);
	}
	
	public void displayLibraryBooks() {
		System.out.println("Books in library:");
		for (Book book : books) {
			System.out.println("Title: " + book.title);
			System.out.println("ISBN: " + book.isbn);
			System.out.println("Author: " + book.author.name);
			System.out.println("Biography: " + book.author.biography);
			System.out.println("----------------------------------");
		}
	}
}
