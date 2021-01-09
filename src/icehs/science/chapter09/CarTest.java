package icehs.science.chapter09;

public class CarTest {
	public static void main(String[] args) {
		Car[] cars = {new Taxi(), new Truck()};
		cars[0].setOilSize(10);
		((Taxi)cars[0]).setMaxMun(4);
		cars[0].go(20);
		
		cars[1].setOilSize(10);
		((Truck)cars[0]).setMaxWeight(100);
		cars[1].go(30);
	}
}