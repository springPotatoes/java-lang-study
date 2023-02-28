public class Ex8_02 {

    public static void main(String[] args) {
        System.out.println(1);
        try{
            System.out.println(0/0); //고의로 오류발생
            System.out.println(2);
        }catch (ArithmeticException ae){
            System.out.println(3);
        }   //try-catch의 끝
        System.out.println(4);
    }//main
}
