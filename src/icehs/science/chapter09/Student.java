package icehs.science.chapter09;

public class Student extends Person {

	String department;
	
	@Override
	void eat() {
		super.eat();
		System.out.println("조별로 식사를 합니다.");
	}
	
	void study() {
		System.out.println("공부를 합니다.");
	}
}
