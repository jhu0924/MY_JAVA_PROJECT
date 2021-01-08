package icehs.science.chapter09;

public class MobileTest {
	public static void main(String[] args) {
		Mobile[] phones = {new Galaxy(), new IPhone()};
		phones[0].call(5);
		phones[0].chaarge(30);
		phones[1].call(10);
		phones[1].chaarge(15);
	}
}
