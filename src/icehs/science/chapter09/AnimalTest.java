package icehs.science.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		Cat c1 = new Cat(3, "페르시안", "야용이");
		System.out.println("이름 : " + c1.getName());
		System.out.println("나이 : " + c1.getAge());
		System.out.println("종류 : " + c1.getKind());
		c1.run();
		c1.hunt();
		c1.play();
		
		Cat d1 = new Cat(2, "시베리안허스키", "개");
		System.out.println("이름 : " + d1.getName());
		System.out.println("나이 : " + d1.getAge());
		System.out.println("종류 : " + d1.getKind());
		d1.run();
		d1.hunt();
	}
}
