
class Data2 {

  int x;
}

public class Ex6_07 {

  public static void main(String[] args) {
    Data2 d = new Data2();
    d.x = 10; //멤버변수 x에 10을 저장 속성 = 멤버변수, 기능 = 메서드
    System.out.println("main() : x = " + d.x);

    change(d);
    System.out.println("After change(d)");
    System.out.println("main() : x = " + d.x);
  }


  static void change(Data2 da) {   //참조형 매개변수
    da.x = 1000;
    System.out.println("change() : x = " + da.x);
  }
}
