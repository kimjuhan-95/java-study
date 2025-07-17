package chapter01;

public class Ex07ArithmeticOperator {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		//산술 연산자
		System.out.println("덧셈: " + (a + b));
		System.out.println("뺼셈: " + (a - b));
		System.out.println("곱셈: " + (a * b));
		System.out.println("나눗셈: " + (a / b));
		
		//증감 연산자
		a++; // a = a + 1, a += 1;
		System.out.println(a); // 11
		
		++a; // a = a + 1, a += 1;
		System.out.println(a);
		
		a--; // a = a - 1, a -= 1;
		System.out.println(a);
		
		--a; // a = a - 1, a -= 1;
		System.out.println(a);
		
		//예상 해보기
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		
		//명시적 형변환
		System.out.println((double)10 / 3);
		System.out.println(10 / (double)3);
		System.out.println((double)(10 / 3));
		
		//나머지 연산 ㅎ%
		//몫: 나누어지는 수(피제수)와 부호가 같다.
		//나머지 :나누는 수(제수)의 절대값 보다 작다
		
	
		
		
	}

}
