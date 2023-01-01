
public class Ex2_8 {
	public static void main(String[] args) {
		int x = 10, y = 5;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		int tmp = x;
		x=y;
		y= tmp;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}
}
