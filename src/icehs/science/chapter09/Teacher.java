package icehs.science.chapter09;

public class Teacher extends Person {
	
	String subject;
	
	@Override
	void eat() {
		super.eat();
		System.out.println("같이 식사를 합니다.");
	}
	
	void teach() {
		System.out.println("가르칩니다.");
	}
}
