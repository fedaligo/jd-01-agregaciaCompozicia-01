package by.htp.agregaciaCompozicia.zadacha05;

public class travelDoc extends typeOfTravel{
	String typeTransport;
	String typeEat;
	int countOfDays;
	
	public travelDoc(String nameOrg,String type,String typeTransport,String typeEat,int countOfDays) {
		this.nameOrg=nameOrg;
		this.type=type;
		this.typeTransport=typeTransport;
		this.typeEat=typeEat;
		this.countOfDays=countOfDays;
	}

	public String getTypeTransport() {
		return typeTransport;
	}

	public void setTypeTransport(String typeTransport) {
		this.typeTransport = typeTransport;
	}

	public String getTypeEat() {
		return typeEat;
	}

	public void setTypeEat(String typeEat) {
		this.typeEat = typeEat;
	}

	public int getCountOfDays() {
		return countOfDays;
	}

	public void setCountOfDays(int countOfDays) {
		this.countOfDays = countOfDays;
	}

	@Override
	public String toString() {
		return "travelDoc [typeTransport=" + typeTransport + ", typeEat=" + typeEat + ", countOfDays=" + countOfDays
				+ ", type=" + type + ", nameOrg=" + nameOrg + "]";
	}
	
}
