package icehs.science.chapter09;

public class MobileTest {
	public static void main(String[] args) {
		Mobile[] phones = {new Galaxy(), new IPhone()};
		((Galaxy)phones[0]).setOsVersion("안드로이드 오레오");
		((IPhone)phones[1]).setColor("휜색");
		phones[0].call(5);
		phones[0].chaarge(30);
		phones[1].call(10);
		phones[1].chaarge(15);
	}
}
