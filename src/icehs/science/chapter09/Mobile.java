package icehs.science.chapter09;

public class Mobile {
	private String product;
	private int price;
	
	public void call(int time) {
		System.out.println(this.product + " : " + time
				+ "�� ��ȭ�߽��ϴ�.");
	}
	public void chaarge(int time) {
		System.out.println(this.product + " : " + time
				+ "�� �����߽��ϴ�.");
	}
}
