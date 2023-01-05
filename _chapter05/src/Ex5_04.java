import java.util.Arrays;

public class Ex5_04 {

  public static void main(String[] args) {
    int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(Arrays.toString(numArr));

    for (int i = 0; i < 100; i++) {
      int n = (int) (Math.random() * 10); //put random number(0~9) in n
      int tmp = numArr[0];  //put numArr[0] in tmp
      numArr[0] = numArr[n];
      numArr[n] = tmp;
    }
    System.out.println(Arrays.toString(numArr));
  }
}
