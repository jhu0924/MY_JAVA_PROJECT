package icehs.science.chapter09;

public class Galaxy {
	private String osVersion;
	public Galaxy() {
		super("Galaxy");
	}
	
	@Override
	public void chaarge(int time) {
		System.out.println("Galaxy : 보조베터리 " + time + "분 충전");
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
}
