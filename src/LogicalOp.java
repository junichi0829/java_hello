
public class LogicalOp {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		// 變數 num1에 貯藏된 값이 1과 100사이의 數인가？
		result = (1 < num1) && (num1 < 100);
		System.out.println("1超過 100未滿인가？ " + result);
		
		// 變數 num2에 貯藏된 값이 2 또는 3의 倍數인가？
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
		System.out.println("2 또는 3의 倍數인가？ " + result);
		
		// 變數 num1이 0인가？
		result = !(num1 != 0);
		System.out.println("0인가？ " + result);
	}

}
