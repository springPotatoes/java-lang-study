
public class Ex3_10 {
	public static void main(String[] args1) {
		long a = 1_000_000*1_000_000;	//기본 자료형인 int형으로 계산 -> 20억 초과 -> 오버플로우
		long b = 1_000_000*1_000_000L;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
