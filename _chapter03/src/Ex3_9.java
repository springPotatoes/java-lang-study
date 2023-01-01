
public class Ex3_9 {
  public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;

    long c = a * b;// int 로 계산했을 경우 20억을 초과해서 int자료형의 최솟값이 나오게 됨
    long d = (long) a * b; // 이처럼 계산해야 정확한 계산이 가능함
    // 또한 변수 a, b를 정의할 때 자료형을 long타입을 쓴다면 계산이 가능하다.

    System.out.println(c);
    System.out.println(d);
  }
}
