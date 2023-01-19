class MyMath2 {

  long a, b;

  //인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
  long add() {
    return a + b; //a, b는 인스턴스 변수
  }

  long subtract() {
    return a - b;
  }

  long multiply() {
    return a * b;
  }

  double divide() {
    return a / b;
  }

  //인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
  static long add(long a, long b) {
    return a + b;
  } //a, b는 지역변수

  static long subtract(long a, long b) {
    return a - b;
  }

  static long multiply(long a, long b) {
    return a * b;
  }

  static double divide(long a, long b) {
    return a / (double) b;
  }
}

public class Ex6_09 {

  public static void main(String[] args) {
    System.out.println(MyMath2.add(200L, 100L));  //클래스 변수를 사용할 때에는 클래스이름.클래스변수 의 형태로 쓰는 것이 좋다.
    //참조변수를 통해서도 클래스변수를 사용할 수 있지만 이렇게하면 인스턴스 변수와 헷갈리기 때문이다.
    System.out.println(MyMath2.subtract(200L, 100L));
    System.out.println(MyMath2.multiply(200L, 100L));
    System.out.println(MyMath2.divide(200L, 100L));

    MyMath2 mm = new MyMath2(); //new에 의해 MyMath2클래스의 인스턴스가 빈공간에 생성된다.
    mm.a = 200L;  //참조변수 mm에 저장된 주소에 있는 인스턴스의 멤버변수 a에 200L을 저장한다.
    mm.b = 100L;
    System.out.println();
    //인스턴스 메서드는 객체생성 후에만 호출이 가능함.
    System.out.println(mm.add());
    System.out.println(mm.subtract());
    System.out.println(mm.multiply());
    System.out.println(mm.divide());

  }
}