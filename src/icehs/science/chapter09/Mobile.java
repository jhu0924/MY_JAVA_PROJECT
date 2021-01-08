package icehs.science.chapter09;

public class Mobile {
	private String product;
	private int price;
	
	public void call(int time) {
		System.out.println(this.product + " : " + time
				+ "분 통화했습니다.");
	}
	public void chaarge(int time) {
		System.out.println(this.product + " : " + time
				+ "분 충전했습니다.");
	}
}
