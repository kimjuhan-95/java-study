package exercise03.prob01;

public class Goods {
    String name;
    int price;
    int stock;

    public Goods(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void printInfo() {
        System.out.println(name + "(가격:" + price + "원)이 " + stock + "개 입고 되었습니다.");
    }
}
