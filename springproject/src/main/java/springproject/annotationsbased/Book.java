package springproject.annotationsbased;

import org.springframework.stereotype.Component;

@Component("b")
public class Book {
	
	int isbn;
	String author;
	String name;
	
	public Book() {
		isbn=98765;
		author="John Viley";
		name="Mircroservices";
	}

	public Book(int isbn, String author, String name) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.name = name;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", name=" + name + "]";
	}
	

}
