package icehs.science.chapter08;

public class IdolArrayTest {
	public static void main(String[] args) {
		
		Idol[] idols = new Idol[4];
		Idols[0] = new Idol("¼Ò³à½Ã´ë", "ÅÂ¿¬");
		Idols[1] = new Idol("¾¾½ºÅ¸", "º¸¶ó");
		Idols[2] = new Idol("ºò¹ð", "Áöµå·¡°ï");
		Idols[3] = new Idol("ºñ½ºÆ®", "¾ç¿ä¼·");
		
		System.out.println(Idols[0].getGroup() + " : " + Idols[0].getName());
		System.out.println(Idols[1].getGroup() + " : " + Idols[1].getName());
		System.out.println(Idols[2].getGroup() + " : " + Idols[2].getName());
	}
	
}
