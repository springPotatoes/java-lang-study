import java.util.Scanner;

public class Ex3_18 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("사과를 10개 담을 수 있는 바구니가 있다. \n사과의 개수를 입력했을 때 필요한 바구니의 개수는?"); // 사과의 개수를 입력했을 때 필요한 바구니의 개수는?
    System.out.print("사과의 개수> "); // 사과의 개수>
    String ch = scanner.nextLine();     // 입력한 문자열을 ch에 저장

    int numOfApples = Integer.parseInt(ch); // 문자열을 정수형으로 전환
    int sizeOfBucket = 10;
    int numOfBucket = (numOfApples / sizeOfBucket); // (numOfApples / sizeOfBucket) + 1; // 모든 사과를 담는데 필요한 바구니의 수

    if (numOfApples % sizeOfBucket != 0) { // 만약 모든 사과를 담는데 필요한 바구니의 수가 0이 아니라면
      ++numOfBucket; // 바구니의 수를 1 증가시킨다.
    }

    System.out.printf("필요한 바구니의 개수는 = %d", numOfBucket);  // 필요한 바구니의 개수는 =
  }
}
