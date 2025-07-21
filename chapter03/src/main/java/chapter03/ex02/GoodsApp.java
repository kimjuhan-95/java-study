package chapter03.ex02;

import chapter03.ex02.Goods;

public class GoodsApp {
	
	public static void main(String[] args) {
		Goods camera = new Goods ();
		
		//public은 접근 제한이 없다.
		camera.name ="nikon";
		
		// protected은 같은 패키지 접근이 가능하다.
		// 더 중요한 것은 자식에서 접근이 가능
		// camera.price = 400000;
		
		// 디폴트는 같은 패키지에서 접근이 가능하다.
		//camera.price = 400000;
		
		//private은 내부에서만 접근이 가능하다.
		//camera.countStock = 20;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		System.out.println(camera.countStock);
		

	}
}
