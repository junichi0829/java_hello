
public class Grade {
	
	private int math;
	private int science;
	private int english;
	private double avg;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public double average() {
		int sum = math + science + english;
		double avg = sum / 3.0;
		
		this.avg = avg;
		return avg;
	}
	
	public String getGrade() {
		String grade = null;
		
		if (avg >= 90) {
			grade = "秀";
		} else if (avg >= 80) {
			grade = "優";
		} else if (avg >= 70) {
			grade = "美";
		} else if (avg >= 60) {
			grade = "良";
		} else {
			grade = "可";
		}
		
		return grade;
	}
}
