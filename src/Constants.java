
// final = 活用

public class Constants {

	public static void main(String[] args) {
		
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		
		CONST_ASSIGNED = 12;	// 割當하지 않았던 常數의 값 割當
		System.out.println("常數1 : " + MAX_SIZE);
		System.out.println("常數2 : " + CONST_CHAR);
		System.out.println("常數3 : " + CONST_ASSIGNED);
	}
	
}
