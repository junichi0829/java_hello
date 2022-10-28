
public class Return {

	public static void main(String[] args) {
		int result;
		result = adder(4, 5);	// adder가 返還하는 값을 result에 貯藏
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 x 3.5 = " + square(3.5));
	}
	
	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;	// addResult의 값을 返還
	}
	
	public static double square(double num) {
		return num * num;	// num * num의 結果를 返還
	}

}
