class Product2 {

    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product2() {    //기본생성자

    }
}

class Tv2 extends Product2 {

    Tv2() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {

    Computer2() {
        super(200);
    }

    public String toString() {
        return "computer";
    }
}

class Audio2 extends Product2 {

    Audio2() {
        super(50);
    }

    public String toString() {
        return "audio";
    }
}

class Buyer2 {                              //고객, 물건을 사는 사람

    int money = 1000;                       //소유금액
    int bonusPoint = 0;                     //보너스 점수
    Product2[] cart = new Product2[10];     //구입한 제품을 저장하기 위한 배열
    int i = 0;                              //Product 배열에 사용할 카운터

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;               //가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;     //제품의 보너스 점수를 추가한다.
        cart[i++] = p;                  //제품을 Product[] cart에 저장한다.

        System.out.println(p + "를 구매하셨습니다.");
    }

    void summary() {               //구매한 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0;               //구입한 물품의 가격합계
        String itemList = "";      //구입한 구입목록

        //반복문을 이요해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                break;
            }
            sum += cart[i].price;
            itemList += (i == 0) ? "" + cart[i] : ", " + cart[i];
        }

        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class Ex7_09 {

    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();

    }
}
