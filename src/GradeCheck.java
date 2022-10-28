
public class GradeCheck {

	public static void main(String[] args) {
		System.out.println(grade(avg(100, 95, 95)));
		System.out.println(getSum(10));
		printSum(10);
		
		/*
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
		*/
		
	}
	
	public static char grade(double avg) {
		char grade = ' ';
		if (avg >= 90) {
			grade = '秀';
		} else if (avg >= 80) {
			grade = '優';
		} else if (avg >= 70) {
			grade = '美';
		} else if (avg >= 60 ) {
			grade = '良';
		} else {
			grade = '可';
		}
		return grade;
	}
	
	public static double avg(int kor, int eng, int math) {
		int sum;
		double avg;
		
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		return avg;
	}
	
	public static int getSum(int num) {
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void printSum(int num) {
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
			
			System.out.print(i);
			
			if (i < num) {
				System.out.print(" + ");
			} else {
				System.out.print(" = " + sum);
			}
		}
	}

}
