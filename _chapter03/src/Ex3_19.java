
public class Ex3_19 { // 클래스 이름을 Ex3_19로 변경
  public static void main(String[] args) {  // main 메서드 시작
    int fahrenheit = 100;// 화씨
    float celcius = (int) ((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f; // 5 / 9f * (fahrenheit - 32) = 37.77778
    // 소수점을 조정한다음 float형에서 int형으로 바꿔서 소숫점 뒤를 모두 날려버리면 가능해진다
    // 0.5를 더하면 기존의 수가 0.5보다 큰지 작은지 판별이 가능하다.

    System.out.println("Fahrenheit : " + fahrenheit); // Fahrenheit : 100
    System.out.println("Celcius : " + celcius); // Celcius : 37.78
  }

}
