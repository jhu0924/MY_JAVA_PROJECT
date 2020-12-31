package icehs.science.chapter04;

public class GradeIfElseEx {

	public static void main(String[] args) {
		
		int gido = 92;
		int giso = 85;
		
		if (gido >= 90 && gido <= 100) {
			System.out.println("홍길동 : A학점입니다.");
		}
		else {
			System.out.println("홍길동 : 공부 더 하고 오세요.");
		}
		if (giso >= 90 && giso <= 100) {
			System.out.println("홍길순 : A학점입니다.");
		}
		else {
			System.out.println("홍길순 : 공부 더 하고 오세요.");
		}
	}

}
