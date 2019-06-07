package by.htp.agregaciaCompozicia.zadacha03;

public class City extends Region{
	String city;
	boolean centralCity;
	boolean oblCenter;
	
	public City(String nameObl,int square,String nameRegion,String city,boolean centralCity,boolean oblCenter) {
		this.nameObl=nameObl;
		this.square=square;
		this.nameRegion=nameRegion;
		this.city=city;
		this.centralCity=centralCity;
		this.oblCenter=oblCenter;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isCentralCity() {
		return centralCity;
	}

	public void setCentralCity(boolean centralCity) {
		this.centralCity = centralCity;
	}

	public boolean isOblCenter() {
		return oblCenter;
	}

	public void setOblCenter(boolean oblCenter) {
		this.oblCenter = oblCenter;
	}
	
	
}
