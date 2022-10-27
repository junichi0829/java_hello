
public class LogicalOpExercise2 {

	public static void main(String[] args) {
		
		// 77은 偶數이면서 7의 倍數이고 11의 倍數인가？
		int num1 = 77;
		boolean result = ((num1 % 2) == 0) && ((num1 % 7) == 0) && ((num1 % 11) == 0);
		
		System.out.println("77은 偶數이면서 7의 倍數이고 11의 倍數인가？" + result);
	}

}
