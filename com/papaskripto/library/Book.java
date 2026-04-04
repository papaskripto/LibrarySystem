public class Book {

	private String name;
	private String author;
	private String isbn;
	private int pages;

	public Book (String name, String author, String isbn, int pages) {
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.pages = pages;
	}

	private void setName (String newName) {
		this.name = newName;
	}

	private String getName () {
		return this.name;
	}

	private void setAuthor (String newAuthor) {
		this.author = newAuthor;
	}

	private String getAuthor () {
		return this.author;
	}

	private void setIsbn (String newIsbn) {
		this.isbn = newIsbn;
	}

	private String getIsbn () {
		return this.isbn;
	}

	private void setPages (int newPages) {
		this.pages = newPages;
	}

	private int getPages () {
		return this.pages;
	}
}
