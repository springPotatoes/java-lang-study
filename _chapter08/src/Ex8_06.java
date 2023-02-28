public class Ex8_06 {

    public static void main(String[] args) {
        try{
            Exception e = new Exception("고의로 발생시킴");
            throw e;
            //위 두줄을 아래와 같이 줄여서 사용할 수 있음.
            // throw new Exception("고의로 발생시킴");

        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
