import java.util.*;
public class Ex4_15 {

  public static void main(String[] args) {
    int input = 0, answer = 0;

    answer = (int)(Math.random() * 100) + 1;
    Scanner scanner = new Scanner(System.in);

    do{
      System.out.print("1과 100사이의 값을 입력하세요 :");
      input = scanner.nextInt();

      if(input > answer){
        System.out.println("더 작은 수를 입력하세요.");
      }else if(input < answer){
        System.out.println("더 큰 수를 입력하세요.");
      }
    } while(input != answer); //input 과 answer가 다른 경우 계속 반복
    System.out.println("정답입니다.");
  }
}
