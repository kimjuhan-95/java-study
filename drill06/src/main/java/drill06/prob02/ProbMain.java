package drill06.prob02;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("제목: ");
		String name = scanner.nextLine();
		
		System.out.println("가격: ");
		int price = scanner.nextInt();
		
		Book book = new Book(name, price);
		System.out.println(book);
		
		scanner.close();

		
	}

}

class Book {
	private String title;
	private int price;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
		
	}
	
	public String toString() {
		return "Book[title=" + title + ", price=" + price + "]";
		
		
	}
}
