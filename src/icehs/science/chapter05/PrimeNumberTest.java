package icehs.science.chapter05;

public class PrimeNumberTest {

	public static void main(String[] args) {
		int firstnum = 23;
		int secondnum = 26;
		
		for(int i = 2; i <= firstnum; i++) {
			if(i != firstnum && firstnum % i == 0) {
				System.out.println(firstnum + "은 소수가 아닙니다.");
				break;
			}else if (i == firstnum) {
				System.out.println(firstnum + "은 소수입니다.");
			}
		}
		for(int i = 2; i <= secondnum; i++) {
			if(i != secondnum && secondnum % i == 0) {
				System.out.println(secondnum + "은 소수가 아닙니다.");
				break;
			}else if (i == secondnum ) {
				System.out.println(secondnum + "은 소수입니다.");
			}
		}
	}

}
