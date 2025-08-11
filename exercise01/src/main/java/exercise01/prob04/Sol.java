package exercise01.prob04;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자: ");
		char ch = scanner.next().charAt(0);
		
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("알파벳입니다.");
		} else {
			System.out.println("알파벳이 아닙니다.");
		}
		
		
		scanner.close();
	}

}
