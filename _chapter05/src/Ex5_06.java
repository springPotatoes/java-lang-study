public class Ex5_06 {

  public static void main(String[] args) {
    String[] names = {"Kim", "Park", "Yi"};

    for (int i = 0; i < names.length; i++) {
      System.out.println("names["+1+"]:"+names[i]);
    }

    String tmp = names[2]; // 배열 names의 세 번째 요소를 tmp에 저장
    System.out.println("tmp:"+tmp);
    names[0] = "Yu";

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
  }
}
