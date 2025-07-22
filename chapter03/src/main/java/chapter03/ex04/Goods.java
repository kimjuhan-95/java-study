package chapter03.ex04;

public class Goods {
	
		private String name;
		private int  price;
		private int countStock;
		private int countSold;
		  
		public int calcDiscountPrice(float percentage) {
			return price -  (int) (price * percentage);
			
			
		}
		
		
		public void showInfo() {
			System.out.println(
					"상품이름:" + name + ","
							+ " 가격: " + price + ", "
									+ "재고량: " + countStock + ", "
											+ "판매량: "+ countSold + "");
					}
		
		
		

	}



