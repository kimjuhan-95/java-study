package drill02.prob04;

/**
 * 문제 4. 형변환 결과 예측
 * 
 * int i = 257;
 * byte b = (byte) i;
 * System.out.println("b = " + b);
 * 
 * 예상 출력:1
 * 이유 257은 이진수로 하면 000100000001 이므로 byte는 8칸까지 표현 가능이므로 앞에 4자리숫자가 제외되어 1이 됨
 */

public class Sol {

	public static void main(String[] args) {
		int i = 257;
		  byte b = (byte) i;
		  System.out.println("b = " + b);
	}

}
