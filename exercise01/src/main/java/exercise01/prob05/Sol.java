package exercise01.prob05;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수[1 - ]:");
		int num = scanner.nextInt();
		
		int sum = 0;
		
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		
		System.out.println("자리수 합: " + sum);
		
		scanner.close();
	}

}
