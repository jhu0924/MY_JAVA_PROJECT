package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String King = "¼¼Á¾´ë¿Õ";
		String money = "10000";
		String Year = "2017";
		int intYear = Integer.parseInt(Year);
		
		System.out.println(King + ":" + money);
		System.out.println(Year + "³â");
		System.out.println(money + Year);
		System.out.println(intYear + Integer.parseInt(money));
	}

}
