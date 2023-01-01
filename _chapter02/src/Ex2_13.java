
public class Ex2_13 {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		int tmp = x;
		x = y;
		y = z;
		z = tmp;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}
}
