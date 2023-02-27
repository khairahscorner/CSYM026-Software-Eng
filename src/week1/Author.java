package week1;

import java.util.ArrayList;

public class Author {
	private String firstname, surname, city;
	private ArrayList<Book> books;
	
	public Author() {
		firstname = "";
		surname = "";
		city = "Lagos";
		books = new ArrayList<Book>();
	}
	
	public Author(String f, String s, String c) {
		firstname = f;
		surname = s;
		city = c;
		books = new ArrayList<Book>();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void addBook(Book b) {
		books.add(b);
	}
	public int countBooks() {
		return books.size();
	}
	public Book getBook(int i) {
		return books.get(i);
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	
	
}
