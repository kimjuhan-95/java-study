package drill05.prob04;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		 int[] numbers = new int [4];
		 int sum = 0;
				 
				 System.out.println("정수 입력:");
				  
				 for(int i = 0; i < numbers.length; i++) {
					 numbers[i] = scanner.nextInt();
					 sum += numbers[i];
					 
				 }
				 
				double average = sum / 4;
				 
				System.out.println("평균: " + average);
				
		scanner.close();
	}

}
