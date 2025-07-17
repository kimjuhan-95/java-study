package chapter01;

public class Ex03VariableConstant {

	public static void main(String[] args) {
		//변수 선언 및 정의(초기화)
		
		short i = 10;
		int age = 30;
		long l = 131313133456123L;
		
		float pi = 3.14f;
		double height = 174.5;
		
		boolean isStudent = true;
		
		char grade = 'A';
		byte b = 20;
		
		System.out.println(i);
		System.out.println(age);
		System.out.println(1);
		System.out.println(pi);
		System.out.println(height);
		System.out.println(isStudent);
		System.out.println(grade);
		System.out.println(b);
		
		// Class
		String name = "김주한";
		System.out.println(name);
		
		// 상수
		final double PI = 3.141592;
		final int MAX_USER = 100;
		
		// 에러
		// MAX_USER = 1000; final 떄문
		System.out.println(PI);
		
		int radius = 10;
		
		
	}
	
}
