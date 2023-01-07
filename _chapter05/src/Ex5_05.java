public class Ex5_05 {

  public static void main(String[] args) {

    int[] ball = new int[45];

    for (int i = 0; i < ball.length; i++) {
      ball[i] = i;
    }

    int temp = 0;
    int j = 0;

    for (int i = 0; i < 6; i++) {
      j = (int) (Math.random() * 45);
      temp = ball[i];
      ball[i] = ball[j];
      ball[j] = temp;
    }

    for (int i = 0; i < 6; i++) {
      System.out.printf("ball[%d]=%d%n", i, ball[i]);
    }
  }
}
//카드 45개를 만든 뒤 카드를 섞어 위에서부터 6개를 뽑는 로직