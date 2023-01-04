public class Ex4_07 {

  public static void main(String[] args) {
    int num = 0;

    //5번 반복
    for (int i = 1; i <= 5; i++) {
      num = (int) (Math.random() * 6) + 1; //1~6사이의 랜덤한 값을 출력.
      /*위에서 int형으로 변환하는 이유는 Math.random() 메서드가 0.0<= Math.random() <1.0 사이의 난수를 생성하기 때문이다.*/
      System.out.println(num);
    }
  }

}
