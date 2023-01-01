
public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";
		int x = 3;
		char c = '0';
		

		System.out.println(str.charAt(0) - '0');
		System.out.println('3' - '0' + 1);
		System.out.println(Integer.parseInt("3") + 1);
		System.out.println("3" + 1);
		System.out.println(3 + '0'); //3은 실수 + 문자 0은 2진법으로 48 => 48+3 = 51출력
		System.out.println(3 - '0'); //숫자 +/- 문자는 숫자로 변환
		System.out.println('3' + '0'); 
		System.out.println('3' - '0'); //문자를 숫자로 변환
		System.out.println((char)3 + '0'); //숫자를 문자로 변환 
	}

}
