
public class LogicalOpExercise {

	public static void main(String[] args) {
		
		// 77은 7의 倍數이고 11의 倍數인가？
		int num1 = 77;
		boolean result;
		
		result = ((num1 % 7) == 0) && ((num1 % 11) == 0);
		System.out.println("77은 7의 倍數이고 11의 倍數인가？" + result);
	}

}
