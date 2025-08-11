package exercise01.prob09;

public class Sol {

	public static void main(String[] args) {
		char text[] = { 'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', ' ', 't', 'o', ' ', 'l', 'e', 'a', 'r', 'n' };
		
		int count = 0;
		
		for (int i = 0; i < text.length; i++) {
			if (text[i] == ' ') {
				text[i] = '-';
				count++;
			}
		}

		System.out.print("변환: ");
        for (char ch : text) {
            System.out.print(ch);
        }
        System.out.println(); 

        System.out.println("바뀐 공백 수: " + count);
	}

}
