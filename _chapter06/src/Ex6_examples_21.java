public class Ex6_examples_21 {

  static int max(int[] arr) {
    int bigNum = 0;
    if (arr == null) {
      return -999999;
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > bigNum) {
        bigNum = arr[i];
      }
    }
    if (bigNum == 0) {
      return -999999;
    } else {
      return bigNum;
    }
  }


  public static void main(String[] args) {
    int[] data = {3, 2, 9, 4, 7};
    System.out.println(java.util.Arrays.toString(data));
    System.out.println("최대값: " + max(data));
    System.out.println("최대값: " + max(null));
    System.out.println("최대값: " + max(new int[]{}));
  }
}
