package drill04.prob12;

import java.util.Scanner;

/**
 * 
 * 문제 12. 소수(Prime Number) 판별
 * 
 * 사용자로부터 정수 하나를 입력받아, 그 수가 소수(prime number)인지 여부를 출력하는 프로그램을 작성하세요.
 * 
 * - 소수란, 1과 자기 자신으로만 나누어 떨어지는 수를 의미합니다.
 * - 예: 2, 3, 5, 7, 11, 13, 17, ...
 * 
 */

public class Sol {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	 
	    System.out.println("숫자를 입력하세요[2 - ] ");
	    int n = scanner.nextInt();
	   
	    for (int n = 2; n > 0 ; n++) {
	    	if( n % 2 == 0 || n % 3 == 0 )
	    		System.out.println("소수가 아닙니다");
	    	break;
	    }
	     else {
	    	System.out.println("소수입니다");
	    	break;
	     	    }
	    
	    
	    
	    scanner.close();
	}

}
