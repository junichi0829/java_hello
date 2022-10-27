
public class CompAssignOp4 {

	public static void main(String[] args) {
		short num = 10;
		num = (short)(num + 77L);	// 型變換을 안 하면 컴파일 誤謬 發生
		int rate = 3;
		rate = (int)(rate * 3.5);	// 型變換을 안 하면 컴파일 誤謬 發生
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L;		// 型變換 必要하지 않다。
		rate = 3;
		rate *= 3.5;	// 型變換 必要하지 않다。
		System.out.println(num);
		System.out.println(rate);
	}

}
