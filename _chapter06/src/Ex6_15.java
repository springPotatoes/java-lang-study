public class Ex6_15 {

  static int[] arr = new int[10];

  static {  //클래스 초기화 블럭
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 10) + 1;
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "]:" + arr[i]);
    }
  }

}
