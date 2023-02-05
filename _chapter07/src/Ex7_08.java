class Product {

    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product {

    Tv1() {
        //조상 클래스의 생성자 Product(int price)를 호출한다.
        super(100);
    }
    //Object 클래스의 toString()을 오버라이딩 함.
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {

    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {

    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족해서 구매할 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "를 구매하셨습니다.");
    }
}

public class Ex7_08 {

    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1());   //Tv1은 Product 클래스의 자손클래스
        //Product p = new Tv1();

        b.buy(new Computer());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}
