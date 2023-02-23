public class Ex7_12 {

    class InstanceInner {

        int iv = 100;
        // static int cv = 100;
        final static int CONST = 100;
    }

    static class StaticInner {

        int iv = 200;
        static int cv = 200; //static 클래스만 static 멤버를 정의할 수 있다.
    }

    void myMethod() {
        class LocalInner {

            int iv = 300;
            //static int cv  = 300 //에러! static 변수를 선언할 수 없다.
            final static int CONST = 300;   // final과 static이 동시에 붙은 변수는 상수이므로 모든 내부클래스에서 정의가능
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
