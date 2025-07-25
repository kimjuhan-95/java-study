package chapter04.object;

public class ObjectMethodExample01 {

	public static void main(String[] args) {
		
		Goods goods = new Goods();
		
		Class klass = goods.getClass(); // reflection
		System.out.println(klass.getName());
		
		System.out.println(goods.hashCode()); // address 기반의 해싱값
		
		
		System.out.println(goods);
		System.out.println(goods.toString());
	
	}

}
