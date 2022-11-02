import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.print("數學、科學、英語 順으로 3個의 整數 入力 → ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("平均은 " + me.average());
        System.out.println(me.getGrade());
	}

}
