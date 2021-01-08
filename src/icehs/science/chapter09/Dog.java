package icehs.science.chapter09;

public class Dog {
	private String name;

	public Dog(int age, String kind, String name) {
		super(age, kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void hunt() {
		System.out.println("������ ��´�.");
	}
	
	@Overrise
	public void run() {
		System.out.println("������ �پ�~!!");
	}
}
