public class Ex6_02 {

  public static void main(String[] args) {
    Tv t1 = new Tv(); //참조변수 t1과, 인스턴스 생성
    Tv t2 = new Tv(); //참조변수 t2와, 인스턴스 생성
    System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
    System.out.println("t1의 channel값은 " + t2.channel + "입니다.");

    t1.channel = 7;
    System.out.println("t1의 channel값을 7로변경하였습니다.");

    System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
    System.out.println("t1의 channel값은 " + t2.channel + "입니다.");

  }
}
