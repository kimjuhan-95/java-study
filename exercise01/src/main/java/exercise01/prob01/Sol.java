package exercise01.prob01;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수: ");
		int n = scanner.nextInt();
		
		int abs = Math.abs(n);
		System.out.println("절대값: " + abs);
		
		
		
		scanner.close();
	}

}
