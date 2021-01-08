package icehs.science.chapter09;

public class Television extends Product {
	private String discription;
	
	public Television(String name, int price,
					int discountRate, String description) {
		super(name, price, discountRate);
		this.discription = description;
		}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
}
