
public class Star {

	public static void main(String[] args) {
		starPrint(3);
		starPrint(7);		
		/*
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		*/
		
	}
	
	public static void starPrint(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
