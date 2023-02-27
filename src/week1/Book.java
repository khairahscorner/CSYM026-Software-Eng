package week1;

public class Book {
	private String title, subject;
	private double price;
	
	public Book(String t, String s, double p) {
		title = t;
		subject = s;
		price = p;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return title + ", " + subject + ", " + price + ".";
	}
}
