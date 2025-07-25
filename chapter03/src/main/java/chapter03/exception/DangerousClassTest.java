package chapter03.exception;

import java.io.IOException;

public class DangerousClassTest {

	public static void main(String[] args) {
		try {
			DangerousClass dc = new DangerousClass();
			dc.danger();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
