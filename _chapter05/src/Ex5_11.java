import java.util.Scanner;

public class Ex5_11 {

  public static void main(String[] args) {
    //5-3 연습문제
    /*
    int[] arr = {10, 20, 30, 40, 50};
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("sum=" + sum);*/

    //5-4 연습문제
    /*int[][] arr = {
        {5, 5, 5, 5, 5},
        {10, 10, 10, 10, 10},
        {20, 20, 20, 20, 20},
        {30, 30, 30, 30, 30}
    };
    int total = 0;
    float average = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        total += arr[i][j];
      }
    }
    average = total / (float) (arr.length * arr[0].length); // 4*5

    System.out.println("total=" + total);
    System.out.println("average=" + average);/**/

    //5-5 연습문제
   /* int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] ball3 = new int[3];

    for (int i = 0; i < ballArr.length; i++) {
      int j = (int) (Math.random() * ballArr.length);
      int tmp = 0;

      tmp = ballArr[i];
      ballArr[i] = ballArr[j];
      ballArr[j] = tmp;
    }

    for (int i = 0; i < ball3.length; i++) {
      ball3[i] = ballArr[i];
    }

    for (int i = 0; i < ball3.length; i++) {
      System.out.println(ball3[i]);
    }

    for (int i = 0; i < ball3.length; i++) {
      System.out.print(ballArr[i]);
    }*/

    //5-6 연습문제
   /* String[] words = {"television", "computer", "mouse", "phone"};

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < words.length; i++) {
      char[] question = words[i].toCharArray(); //String을 char[]로 변환
      for (int j = 0; j < question.length; j++) {
        int random = (int) (Math.random() * question.length);
        char tmp = question[j];
        question[j] = question[random];
        question[random] = tmp;
      }

      System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question));
      String answer = scanner.nextLine();

      if (words[i].equals(answer.trim())) {
        System.out.printf("맞았습니다.%n%n");
      } else {
        System.out.printf("틀렸습니다.%n%n");
      }
    }*/
  }
}


