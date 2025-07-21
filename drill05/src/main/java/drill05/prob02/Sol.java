package drill05.prob02;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		
		int [] numbers = new int[6];
		
		System.out.println("정수 입력:");
		
		for ( int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
			
		}
		
		System.out.print("짝수:");
		for (int num : numbers ) {
			if ( num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
		scanner.close();

	}

}
