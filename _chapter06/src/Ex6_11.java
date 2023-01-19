class Data_1{
  int value;
}

class Data_2{
  int value;
  Data_2(int x){  //매개변수가 있는 생성자
    value = x;
  }
}


public class Ex6_11 {

  public static void main(String[] args) {
    Data_1 d1 = new Data_1();
    //Data_2 d2 = new Data_2();  compile error
    //에러가 발생하는 이유: Data_2 클래스에서 Data_2()라는 생성자를 찾을 수 없다는 내용의 에러메시지인데, Data_2클래스에 생성자 Data_2()가 정의되어 있지 않기 때문에 에러가 발생한 것.
    //컴파일러가 자동적으로 기본 생성자를 추가해주는 경우는 '클래스 내에 생성자가 하나도 없는 경우' 뿐이다.
    //위의 오류를 해결하기 위해서는 Data_2(int x)를 사용하거나 Data_2클래스에 생성자 Data_2()를 추가로 정의해주면 된다.
  }

}
