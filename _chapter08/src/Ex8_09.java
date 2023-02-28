public class Ex8_09 {

    public static void main(String[] args) throws Exception {
        method1(); //같은 클래스 내의 static 멤버이므로 객체 생성 없이 직접 호출가능
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }

    //위를 실행하면 비정상저긍로 종료햇다는 것과 예외 발생 시 호출스택의 내용을 알 수 있다.
    //예외가 발생할 때 모두 3개의 메서드가 호출스택에 있었으며
    // 예외가 발생한 곳은 제일 윗줄 method2()라는 것과
    //main 메서드가 method1()을 , 그리고 method1()은 method2()를 호출했다는 것을 알 수 있다.

}
