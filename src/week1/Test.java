package week1;

public class Test {

	public static void main(String[] args) {
		Book testBook = new Book("Software Engineering", "Computing", 30);
		Author aut = new Author("Airah", "Yusuff", "Lagos");
		
		aut.addBook(testBook);
		
		System.out.println(aut.countBooks());
		

	}

}
