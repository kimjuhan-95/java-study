package exercise01.prob10;

public class Sol {

	public static void main(String[] args) {
		int data[] = {5, 9, 3, 8, 60, 20, 1};
		int count = data.length;

		System.out.println("Before Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(data[i] + " ");
		}
		
		for (int i = 0; i < count - 1; i++) {
			for (int j = 0; j < count - 1 - i; j++) {
				if (data[j] < data[j+1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}

		
		
		

		System.out.println("\nAfter Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(data[i] + " ");
		}		
	}	
}
