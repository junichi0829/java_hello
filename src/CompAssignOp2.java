
public class CompAssignOp2 {

	public static void main(String[] args) {
		
		float f1 = 0.1f;
		long l = 10L;
		
		float result = f1 + l;
		System.out.println(result);
		
		double pi = 3.14;
		int num = (int)pi;
		
//		pi = num;
		
		System.out.println(num);

		short sh1 = 'A';
		short sh2 = 1;
		
		char sh3 = (char)(sh1 + sh2);
		
		System.out.println(sh3);
	}

}
