
public class Ex3_11 {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		double Pi = Math.round(pi*100)/1000.0;
		System.out.println(shortPi);
		System.out.println(Pi);
		
		//3.141592 *1000 / 1000.0 을 하는 이유는 
		//3.141592 *1000 은 3141.592이고 이를 반올림하면
		//3142가 된다. 이를 다시 1000.0으로 나누어서 3.142가 된다.
	}
}
