class Car {

  String color; //색상
  String gearType;  //변속기 종류 - auto(자동), manual(수동)
  int door; //문의 개수

  Car() {
  }

  Car(String c, String g, int d) {  //매개변수가 있는 생성자
    color = c;
    gearType = g;
    door = d;
  }
}

public class Ex6_12 {

  public static void main(String[] args) {
    Car c1 = new Car();
    c1.color = "while";
    c1.gearType = "auto";
    c1.door = 4;

    Car c2 = new Car("white", "auto", 4); //앞으로 이렇게 인스턴스 변수를 초기화하자.

    System.out.println(
        "c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
    System.out.println(
        "c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
  }

}
