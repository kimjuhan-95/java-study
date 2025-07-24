package chapter03.ex04;

public class GoodsApp {
	
	public static void main(String[] args) {
		Goods camera = new Goods ();
		camera.setname ="nikon";
		camera.setprice = 400000;
		camera.countSold = 10;
		camera.setcountStock = 20;
		
		camera.setName("nikon");
		
//		System.out.println(camera.name);
//		System.out.println(camera.price);
//		System.out.println(camera.countSold);
//		System.out.println(camera.countStock);
		
		camera.showInfo();
		
		String name = camera.getName();
		System.out.println("상품이름:" + name);
	}

}
