package icehs.science.chapter09;

public class IPhone extends Mobile {
	private String Color;
	public IPhone() {
		super("IPhone");
	}
	
	@Override
	public void chaarge(int time) {
		System.out.println("IPhone : " + time + "�� �����ߴ��� FULL");
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
}
