class Ex6_01 {

  public static void main(String[] args) {
    Tv t; //Tv클래스 타입의 참조변수 t를 선언
    t = new Tv(); //new에 의해 Tv클래스의 인스턴스(객체)가 메모리의 빈 공간에 생성된다.
    t.channel = 7;  //참조변수 t에 저장된 주소에 있는 인스턴스의 멤버변수 channel에 7을 저장한다. 인스터스의 멤버변수(속성)을 사용하려면 '참조변수.멤버변수'로 하면된다.
    t.channelDown();  //참조변수 t가 참조하고 있는 Tv인스턴스의 channelDown 메서드를 호출한다. channel Down 메서드는 멤버변수 channel에 저장되어 있는 값을 1 감소시킨다.
    System.out.println("현재 채널은 " + t.channel + "입니다.");
  }
}

class Tv {

  //Tv의 속성(멤버변수)
  String color;
  boolean power;
  int channel;

  void power() {  //TV켜거나 끄는 메서드
    power = !power;
  }

  void channelUp() {
    ++channel;
  }

  void channelDown() {
    --channel;
  }
}
