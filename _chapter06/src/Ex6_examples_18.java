public class Ex6_examples_18 {

  static boolean isNumber(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch <= '9' && ch >= '1')
        ;
      else {
        count++;
      }
    }
    if (count == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    String str = "123";
    System.out.println(str + "는 숫자입니까? " + isNumber(str));

    str = "1234o";
    System.out.println(str + "는 숫자입니까? " + isNumber(str));
  }
}
