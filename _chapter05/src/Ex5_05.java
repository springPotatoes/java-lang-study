public class Ex5_05 {

  public static void main(String[] args) {
    //make the lottery number
    //1~45개의 카드 중 맨 윗장 6장을 꺼내는 것과 비슷한 원리

    int[] ball = new int[45];

    //배열에 1~45값 저장
    for (int i = 0; i < ball.length; i++) {
      ball[i] = i;
    }

    int temp = 0;
    int j = 0;

    //배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꾼다.
    //배열에 로또 번호를 저장하는 로직
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
