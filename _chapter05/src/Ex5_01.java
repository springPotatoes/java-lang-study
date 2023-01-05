import java.util.Arrays;

public class Ex5_01 {

  public static void main(String[] args) {
    int[] iArr1 = new int[10];
    int[] iArr2 = new int[10];
    int[] iArr3 = {100, 95, 80, 70, 60};
    char[] chArr = {'a', 'b', 'c', 'd'};

    for (int i = 0; i < iArr1.length; i++) {  // Initialize iArr1 with 1~10 // 1~10까지를 저장 (초기화)
      iArr1[i] = i + 1;
    }

    for (int i = 0; i < iArr2.length; i++) {
      iArr2[i] = (int) (Math.random() * 10) + 1; //1~10의 값을 배열에 저장
    }
    //배열 출력

    for (int i = 0; i < iArr1.length; i++) {
      System.out.print(iArr1[i] + ",");
    }
    System.out.println();

    System.out.println(Arrays.toString(iArr2));   //iArr2 의 배열을 출력   //Arrays.toString() : 배열을 문자열로 변환
    System.out.println(Arrays.toString(iArr3));   //iArr3 의 배열을 출력    //Arrays.toString() : 배열을 문자열로 변환
    System.out.println(Arrays.toString(chArr));
    System.out.println(iArr3);    //배열의 요소를 출력하는 것이 아니라 참조변수값(주소값)을 출력하는 것.
    System.out.println(chArr);

  }
}
