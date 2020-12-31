package icehs.science.chapter04;

public class ConditionIfElseIfEx {

	public static void main(String[] args) {
		
		int age = 15;
		
		if (age >= 19) {
			System.out.println("성인입니다. 입장하세요.");
		}else if (age >= 13 ) {
			System.out.println("청소년입니다. 잠시만 기다리세요.");
		}else {
			System.out.println("어린이 입니다. 집에 가세요.");
		}
	}

}
