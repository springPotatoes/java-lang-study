public class Ex4_02 {

  public static void main(String[] args) {
    int x = 0;
    System.out.printf("x=%d 일 때, 참인것은 %n", x);

    if (x == 0) {
      System.out.println("x=0이다");
    }
    if (!(x == 0)) {
      System.out.println("x==0이 아니다");
    }
    if (x != 0) {
      System.out.println("x!=0이다");
    }
    if (!(x != 0)) {
      System.out.println("x!=0이 아니다");
    }

    x = 1;
    System.out.printf("x=%d 일 때, 참인것은%n", x);

    if (x == 0) {
      System.out.println("x=0이다");
    }
    if (!(x == 0)) {
      System.out.println("x==0이 아니다");  // x==0이 아니다
    }
    if (x != 0) {
      System.out.println("x!=0이다");
    }
    if (!(x != 0)) {
      System.out.println("x!=0이 아니다");

    }

  }
}