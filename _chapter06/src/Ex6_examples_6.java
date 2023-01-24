public class Ex6_examples_6 {

  public static void main(String[] args) {
    MyPoint1 p = new MyPoint1(1, 1);

    System.out.println(p.getDistance(2, 2));
  }
}
class MyPoint1{
  int x;
  int y;

  MyPoint1(int x, int y){
    this.x = x;
    this.y = y;
  }
  double getDistance(int a, int b){
    return Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
  }

}

