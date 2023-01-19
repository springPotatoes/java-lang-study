public class Ex6_10 {

  public static void main(String[] args) {
    MyMath3 mm = new MyMath3();
    System.out.println("mm.add(3, 3) 결과: " + mm.add(3, 3));
    System.out.println("mm.add(3L, 3) 결과: " + mm.add(3L, 3));
    System.out.println("mm.add(3, 3L) 결과: " + mm.add(3, 3L));
    System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L, 3L));

    int[] a = {100, 200, 300};
    System.out.println("mm.add(a) 결과: " + mm.add(a));
  }
}

class MyMath3 {

  //매개변수의 타입만 4가지로 나누어서 테스트
  int add(int a, int b) {
    System.out.print("int add(int a, int b) - ");
    return a + b;
  }

  long add(int a, long b) {
    System.out.print("long add(int a, long b) - ");
    return a + b;
  }

  long add(long a, int b) {
    System.out.print("long add(long a, int b) - ");
    return a + b;
  }

  long add(long a, long b) {
    System.out.print("long add(long a, long b) - ");
    return a + b;
  }

  int add(int[] a) {
    System.out.print("int add(int[] a) - ");
    int result = 0;

    for (int i = 0; i < a.length; i++) {
      result += a[i];
    }
    return result;
  }
}
//왜 add 메서드가 println메서드보다 먼저 호출되는가?
/*
 * System.out.println("mm.add(3, 3) 결과: " + mm.add(3, 3));
 * 위 문장은 아래와 같기 때문!!
 * int result = mm.add(3, 3);
 * System.out.println("mm.add(3, 3) 결과: " + result);  */