
public class CondOp {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		
		int big;
		int diff;
		
		big = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("큰 數는" + big + "입니다。");
		
		if ((num1 - num2) > 0) {
			System.out.println("큰 數" + (num1 - num2));
		} else {
			System.out.println("큰 數" + -(num1 - num2));
		}
	}

}
