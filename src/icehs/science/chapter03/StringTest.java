package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String King = "�������";
		String money = "10000";
		String Year = "2017";
		int intYear = Integer.parseInt(Year);
		
		System.out.println(King + ":" + money);
		System.out.println(Year + "��");
		System.out.println(money + Year);
		System.out.println(intYear + Integer.parseInt(money));
	}

}
