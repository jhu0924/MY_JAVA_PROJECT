package icehs.science.chapter04;

public class ValuationBasisTest {

	public static void main(String[] args) {
		
		int firstNum = 10;
		int secondNum = 20;
		int thirdNum = 40;
		int forthNum = 50;
		int fifthNum = 80;
		
		double result = 0;
		result = firstNum * secondNum / 2 * 0.6;
		result = result + (thirdNum + forthNum)/ 2 * 0.13;
		result = result + fifthNum * 0.27;
		
		System.out.println("������ : " + result);
		
		if (result >= 95 && result <= 100) {
			System.out.println("special class�Դϴ�.");
		}else if (result >= 90 && result < 95) {
			System.out.println("good class�Դϴ�.");
		}else if (result >= 85 && result < 90) {
			System.out.println("silver class�Դϴ�.");
		}else if (result >= 80 && result < 85) {
			System.out.println("bronze class�Դϴ�.");
		}else if (result <= 80) {
			System.out.println("iron class�Դϴ�.");
		}
	}

}
