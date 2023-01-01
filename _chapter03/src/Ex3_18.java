import java.util.Scanner;

public class Ex3_18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("사과를 10개 담을 수 있는 바구니가 있다. \n사과의 개수를 입력했을 때 필요한 바구니의 개수는?");
    System.out.print("사과의 개수>");
    String ch = scanner.nextLine();

    int numOfApples = Integer.parseInt(ch); // 문자열을 정수형으로 전환
    int sizeOfBucket = 10;
    int numOfBucket = (numOfApples / sizeOfBucket);

    if (numOfApples % sizeOfBucket != 0) {
      ++numOfBucket;
    }
    System.out.printf("필요한 바구니의 개수는 = %d", numOfBucket);
  }
}
