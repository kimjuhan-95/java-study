package exercise03.prob01;

import java.util.Scanner;

public class ProbMain {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		for (int i = 0; i < COUNT_GOODS; i++) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int stock = scanner.nextInt();
			
			goods[i] = new Goods(name, price, stock);
		}

		for (int i = 0; i <COUNT_GOODS; i++) {
			goods[i].printInfo();
		}
		
		scanner.close();
	}
}