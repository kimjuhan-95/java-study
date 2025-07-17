package chapter01;

public class Ex10OperatorExample {
	
	public static void main(String[] args) {
		final int TIME = 500; //총 시간(초)
		
		int second = TIME % 60;
		int minute = (TIME / 60) % 60;
		int hour = TIME / 60 /60;
		
		// 코딩 하세요~
		
		System.out.println(TIME + "초는 ");
		System.out.println(hour + "시간, ");
		System.out.println(minute + "분, ");
		System.out.println(second + "초 입니다.");
		
		
	}

}
