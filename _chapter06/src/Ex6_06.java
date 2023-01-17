class Data {

  int x;
}

public class Ex6_06 {

  public static void main(String[] args) {
    Data d = new Data();    // Data클래스 타입의 참조변수 d 선언 & new에 의해 Data클래스의 인스턴스가 메모리의 빈공간에 생성
    d.x = 10;     //참조변수 d에 저장된 주소에 있는 인스턴스의 멤버변수 x 에 10을 저장
    System.out.println("main() : x = " + d.x);

    change(d.x);  //change라는 매서드 사용
    System.out.println("After change(d.x)");

    System.out.println("main() : x = " + d.x);
  }

  static void change(int x) { //기본형 매개변수
    x = 1000;
    System.out.println("cange() : x = " + x);
  }
}
/*
* d.x의 값이 변경된 것이 아니라, change메서드의 매개변수 x의 값이 변경된 것이다. 즉. 원본이 아닌 복사본이 변경된 것이라 원본에는 아무런 영향을 미치지 못한다.
* 이처럼 기본형 매개변수는 변수에 저장된 값만 읽을 수만 있을 뿐 변경할 수는 없다.
* */

