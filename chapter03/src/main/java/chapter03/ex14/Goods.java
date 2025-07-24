package chapter03.ex14;

public class Goods {
	static int countOfGoods;
		private String name;
		protected int  price;
		private int countStock;
		private int countSold;
		
		public Goods () {
			
		}
		public Goods(String name, int price, int countStock, int countSold) {
			this.name = name;
			this.price = price;
			this.countStock = countStock;
			this.countSold = countSold;
		}
		  
		public int calcDiscountPrice(float percentage) {
			return price -  (int) (price * percentage);
			
			
		}
		
		
		public void showInfo(boolean summarry) {
			if(summarry) {
				
			}
			System.out.println(
					"상품이름:" + name + ","
							+ " 가격: " + price + ", "
									+ "재고량: " + countStock + ", "
											+ "판매량: "+ countSold + "");
					}

		
		public void sell();
		if(countStock > 0) {
			countStock --;
			countSlod++;
			
		}
		public static int getCountOfGoods() {
			return countOfGoods;
		}

		public static void setCountOfGoods(int countOfGoods) {
			Goods.countOfGoods = countOfGoods;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getCountStock() {
			return countStock;
		}

		public void setCountStock(int countStock) {
			this.countStock = countStock;
		}

		public int getCountSold() {
			return countSold;
		}

		public void setCountSold(int countSold) {
			this.countSold = countSold;
		}
		
		
		

	}



