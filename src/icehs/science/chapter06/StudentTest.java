package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student gildong = new Student();
		
		gildong.name = "홍길동";
		gildong.id = "S001";
		gildong.korean = 94;
		gildong.english = 80;
		gildong.math = 89;
		
		/*System.out.println("이름 : " + gildong.name);
		*System.out.println("학번 : " + gildong.id);
		*System.out.println("국어 성적 : " + gildong.korean);
		*System.out.println("영어 성적 : " + gildong.english);
		*System.out.println("수학 성적 : " + gildong.math);
		*/
		gildong.printStudentInfo();
		System.out.println("평균 : " + gildong.calcAverage());
		
		System.out.println("* 학번을 변경합니다!!!");
		
		gildong.changeStudentID("STU0001");
		
		gildong.printStudentInfo();
	}

}
