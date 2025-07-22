package drill05.prob06;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.println("정수 입력: ");
		
		for(int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
		}

		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		/* 코드 작성 */
		System.out.println("int의 최솟값: " + min);
		
		scanner.close();		

}
}
