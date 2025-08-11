package exercise01.prob08;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int[] MONEYS = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

		System.out.println("입력: ");
		int amount = scanner.nextInt();
		
		for (int i = 0; i < MONEYS.length; i++) {
			int count = amount / MONEYS[i];
			amount = amount % MONEYS[i];
			
			System.out.println(MONEYS[i] + "원 : " + count + "개");
		}
		
		scanner.close();
	}

}
