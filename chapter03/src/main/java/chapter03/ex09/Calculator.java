package chapter03.ex09;

public class Calculator {
	
	public static int add(int lValue,int rValue) {
		return  lValue + rValue;
	}
	
	public static int subtract(int lValue,int rValue) {
        return lValue - rValue;
    }

    public static int multiply(int lValue,int rValue) {
        return lValue * rValue;
    }

    public static int divide(int lValue,int rValue) {
        if (rValue == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return lValue / rValue;
    }

}
