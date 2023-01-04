public class Ex4_21 {

  public static void main(String[] args) {
    //예제 문제풀이 연습장

    //4-5
   /*
    for(int i=0;i<=10; i++){
      for(int j =0; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    */

    /*int i = 0, j = 0;
    while (i <= 10) {
      i++;
      while (j < i) {
        System.out.print("*");
        j++;
      }
      j=0;
      System.out.println();
    }*/

    //4-7
    /*String str = "12345";
    int sum = 0;

    for (int i = 0; i < str.length(); i++) {
      sum += str.charAt(i) - '0'; //문자열을 문자형으로 바꾼뒤 '0'을 빼서 다시 int 형으로 변환함.
    }
    System.out.println("sum=" + sum);*/

    /*//4-6
    for(int i=0; i<6; i++){
      for(int j =0; j<6; j++){
        if(i + j ==6)
          System.out.println("["+i+","+j+"]");
      }
    }*/

    /*//4-9
    int num = 12345;
    int sum = 0;
    for (; ; ) {
      sum += num % 10;

      num = num / 10;

      if (num == 0) {
        break;
      }
    }
    System.out.println("sum=" + sum);*/

    //4-10
    int answer = (int) (Math.random() * 100) + 1; //1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
    // Math.random() * a 에 꼭 괄호를 넣어야 한다. 넣지 않으면 항상 0의 값이 나오게 된다. 연산자 우선순위 계산 때문이다.
    System.out.println(answer);
    int input;
    int count = 0;

    java.util.Scanner s = new java.util.Scanner(System.in);

    do {

      System.out.print("1과 100사이의 값을 입력하세요 :");
      input = s.nextInt();
      count++;

      if (input < answer) {
        System.out.println("더 큰 수를 입력하세요.");
      }
      if (input > answer) {
        System.out.println("더 작은 수를 입력하세요.");
      }
      if (input == answer) {
        System.out.println("정답입니다.");
        break;
      }
    } while (true);
    System.out.println("시도횟수는 " + count + "번입니다.");
  } //end of main
} //end of class
