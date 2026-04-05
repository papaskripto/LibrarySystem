import java.util.ArrayList;

public class Library {

	private User<String> users;
	private Book<String> books;

	private Library (User users, Book books) {
		this.users = new User <>();
		this.books = new Book <>();
	}

	private void addBook (Book book) {
		books.add (book);
	}

	private void borrowBook (Book book) {
		books.remove (book);
	}

	private void listBooks () {
		for (Books: book) {
			return book;
		}
	}
}
