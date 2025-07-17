package chapter01;

public class Ex05DataType {

	public static void main(String[] args) {
		
		int apples = 5;
		float price = 2.99f;
		char letter = 'J';
		boolean isOn = false;
				
		//참조형( reference type)
		String message1 = "Welcome to Java!";
		String message2 = new String("Welcome to Java!");
		int[] scores1 = {90, 10, 100};
		int[] scores2 = new int[3];
		
		
		System.out.println(message1);
		System.out.println(message2);
		System.out.println(scores1);
		System.out.println(scores2);
	}

}
