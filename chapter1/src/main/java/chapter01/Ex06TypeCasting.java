package chapter01;

public class Ex06TypeCasting {

	public static void main(String[] args) {
		// 자동 형변환(암시적) 작은 에서 큰
		int x = 100;
		long y = x; //ok
		
		System.out.println(y);
		
		// 강제 형변환(명시적) 큰 에서 작은
		double d = 3.14;
		int i = (int)d;
		
		System.out.println(d);
		
		//데이터 손실 예시
		int large = 257;
		byte b = (byte)large; // 출력은 1(256 손실)
		System.out.println(b);
		
	}
}
