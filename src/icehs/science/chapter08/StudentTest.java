package icehs.science.chapter08;

public class StudentTest {
	public static void main(String[] args) {
		Student[] st = new Student[3];
		st[0] = new Student("������", "STU001", "010-1234-5678");
		st[1] = new Student("�̼���", "STU002", "010-2345-6789");
		st[2] = new Student("������", "STU003", "010-9876-5432");
		
		for(int i = 0; i < st.length; i++) {
			st[1].printStudentInfo();
		}
	}
}
