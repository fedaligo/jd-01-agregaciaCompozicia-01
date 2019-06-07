package by.htp.agregaciaCompozicia.zadacha04;


public class RS extends Customer{
	int number;
	boolean activ;
	int balans;
	
	
	
	public RS(String nameOrg,String name,int number,boolean activ,int balans){
		
		this.number=number;
		this.activ=activ;
		this.balans=balans;
		this.nameOrg=nameOrg;
		this.name=name;
		
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isActiv() {
		return activ;
	}

	public void setActiv(boolean activ) {
		this.activ = activ;
	}

	public int getBalans() {
		return balans;
	}

	public void setBalans(int balans) {
		this.balans = balans;
	}
	
}
