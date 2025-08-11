package exercise01.prob02;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수[1 - ]: ");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			char ch = (char) ('A' + i);
			System.out.print(ch + " ");
		}
		
		
		scanner.close();
	}

}
