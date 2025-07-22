package drill05.prob07;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.println("배열:");
		for(int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
			
		}
		
		
		System.out.println("찾을값:");
		int target = scanner.nextInt();
		
		int index = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				index = i;
				break;
			}
		}
		System.out.println(target + "은 인덱스" + index + "에 있음");
		
		scanner.close();
		
		/* 코드 작성 */
	}

}
