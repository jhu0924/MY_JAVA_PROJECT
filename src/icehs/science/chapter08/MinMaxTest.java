package icehs.science.chapter08;

public class MinMaxTest {
	public static void main(String[] args) {
		
		int [] arr = {12, 53, 24, 10, 22, 38, 64, 39};
		
		int maw = arr[0];
		int min = arr[0];
		System.out.println("�迭 ������ : ");
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[1];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

	}
}
