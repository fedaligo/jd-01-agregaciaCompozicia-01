package by.htp.agregaciaCompozicia.zadacha02;

public class Avto{
	
	private String name;
	
	Wheel w=new Wheel();
	Engine e=new Engine();
	
	public Avto(String name,boolean[] instWheel,boolean[] damage,boolean ride,int fuel){
		w.setDamage(damage);
		w.setInstWheel(instWheel);
		e.setRide(ride);
		e.setFuel(fuel);
		this.name=name;
	
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Avto [name=" + name + ", w=" + w + ", e=" + e + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avto other = (Avto) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
