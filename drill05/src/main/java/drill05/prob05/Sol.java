package drill05.prob05;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.println("정수 입력: ");
		
		for(int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
		}

		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		/* 코드 작성 */
		System.out.println("int의 최대값: " + max);
		
		scanner.close();		
	}

}
