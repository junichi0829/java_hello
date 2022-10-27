
public class GradeCheck {

	public static void main(String[] args) {
		
		int kor = 80;
		int eng = 40;
		int math = 30;
		int total;
		double avg;
		
		total = kor + eng + math;
		avg = total / 3.0;
		
		if (avg >= 90) {
			System.out.println("秀 입니다。");
		} else if (avg >= 80) {
			System.out.println("優 입니다。");
		} else if (avg >= 70) {
			System.out.println("美 입니다。");
		} else if (avg >= 60 ) {
			System.out.println("良 입니다。");
		} else {
			System.out.println("可 입니다。");
		}
		
	}

}
