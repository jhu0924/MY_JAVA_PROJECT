package icehs.science.chapter06;

public class Account {
	String name;
	String accNo;
	int balance;
	
	void deposit(int money) {
		System.out.println(money + "���� �Ա��մϴ�.");
		if(money < 0) {
			System.out.println("[����]�ݾ��� ������ �Է��� �� �����ϴ�.,");
		}else {
			balance += money; //balance = balance + money;
		}
	}	
	int withdraw(int money) {
		System.out.println(money + "���� ����մϴ�.");
		
		if(money < 0) {
			System.out.println("[����]�ݾ��� ������ �Է��� �� �����ϴ�.");
			return 0;
		}else if (balance < money){
			System.out.println("[����]�ܾ��� �����մϴ�.");
			return 0;
		}else {
			balance -= money;
			return money;
		}
	}
	
	void printAccountInfo() {
		System.out.println("���� " + accNo + "(������ : " + name +")");
		System.out.println("�ܾ� " + balance + "��");
		
		System.out.println("������ : " + name);
		System.out.println("���¹�ȣ : " + accNo);
		System.out.println("�ܾ� : " + balance);
	}

}