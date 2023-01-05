public class Ex5_02 {

  public static void main(String[] args) {
    int sum = 0;

    int[] score = {100, 88, 100, 100, 90};

    /*
    * 타입 [] 변수이름; => 배열의 선언(배열을 다루기 위한 참조변수 선언)
    * 변수이름 = new 타입[길이] => 배열의 생성(실제 저장공간을 생성)
    *
    * */

    for (int i = 0; i < score.length; i++) {
      sum += score[i];
    }
    float average = sum / (float) score.length;
     //계산결과를 float로 얻기 위해서 형변환

    System.out.println("총합 : " + sum);
    System.out.println("평균 : " + average);
  }
}
