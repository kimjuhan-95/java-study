package drill05.prob08;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input = new int [6];
		int[] unique = new int [6];
		int uniqueCount = 0;
		
		System.out.println("정수 입력: ");
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
		}

		for (int i = 0; i < input.length; i++) {
			boolean isDuplicate = false;
			
			for (int j = 0; j < uniqueCount; j++) {
				if (input[i] == unique[j]) {
					isDuplicate = true;
					break;
				}
			}
			
			if (!isDuplicate) {
				unique[uniqueCount] = input[i];
				uniqueCount++;
			}
		}
		
		System.out.print("중복 제거 후: ");
		for (int i = 0; i < uniqueCount; i++) {
			System.out.print(unique[i] + " ");
		}
		scanner.close();
	}

}
