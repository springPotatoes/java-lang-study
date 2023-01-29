public class Ex6_examples_19 {

  static boolean isNumber(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
        count++;
      } else {
        return false;
      }
    }
    if (count != 0) {
      return true;
    }

    return true;
  }

  public static void main(String[] args) {
    String str = "123";
    System.out.println(str + "는 숫자입니까? " + isNumber(str));

    str = "1234o";
    System.out.println(str + "는 숫자입니까? " + isNumber(str));
  }
}


