public class Ex4_10 {

  public static void main(String[] args) {
    int sum = 0;

    for (int i=1; i<=20; i++){
      sum += i;
      System.out.printf("1부터 %d까지의 합: %2d%n", i, sum);
    }
  }
}
