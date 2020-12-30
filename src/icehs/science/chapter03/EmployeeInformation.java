package icehs.science.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name = "홍길동";
		int now = 2020;
		int past = 2002;
		
		System.out.println("이름 : " + name);
		System.out.println("입사년도 : " + past);
		System.out.println("근무년수 : " + (now - past));
	}

}
