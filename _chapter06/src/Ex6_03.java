public class Ex6_03 {

  public static void main(String[] args) {
    System.out.println("Card.width = " + Card.width);
    System.out.println("Card.height = " + Card.height);

    Card c1 = new Card();
    c1.kind = "Heart";
    c1.number = 7;

    Card c2 = new Card();
    c2.kind = "Spade";
    c2.number = 4;

    System.out.println(
        "c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
    System.out.println(
        "c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
    System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
    Card.width = 50;
    c1.height = 80; //클래스 변수를 사용할 떄에는 c1.width 대신 Card.width 를 사용하자 왜냐면 클래스 변수를 인스턴스 변수로 오해할 수 있기 때문.

    System.out.println(
        "c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
    System.out.println(
        "c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
  }
}

class Card {

  //멤버변수
  String kind; //카드의 무늬
  int number; //카드의 숫자
  static int width = 100;
  static int height = 250;
}
