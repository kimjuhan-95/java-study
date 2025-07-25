package exercise03.prob02;

public class CurrencyConverter {
	private static double rate;
	
	public static void setRate(double i) {
		rate = i;
		
	}
	
	public static double toDollar(double won) {
		return won / rate;
	}
	
	
	public static double toKRW(double dollar) {
		return dollar * rate;
	}
}