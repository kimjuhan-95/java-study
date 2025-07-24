package chapter03.ex12;

public class GoodsApp {
	
	public static void main(String[] args) {
//		Goods camera = new Goods ();
//		camera.setName =("nikon");
//		camera.setPrice = (400000);
//		camera.setCountSold = (10);
//		camera.setCountStock = (20);
		
		Goods camera = new Goods("nikon", 400000, 10, 20);
		
		
		camera.showInfo();
	}
}