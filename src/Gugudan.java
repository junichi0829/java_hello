
public class Gugudan {

	public static void main(String[] args) {
		
		int result = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i % 3 == 0) {
					result = i * j;
					System.out.println(i + " x " + j + " = " + result);					
				}
			}
			System.out.println();
		}
		
		
		
	}

}
