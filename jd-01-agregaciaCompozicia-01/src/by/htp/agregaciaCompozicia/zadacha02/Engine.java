package by.htp.agregaciaCompozicia.zadacha02;

public class Engine {
	
	private boolean ride;
	private int fuel;
	
	public boolean isRide() {
		return ride;
	}
	public void setRide(boolean ride) {
		this.ride = ride;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "Engine [ride=" + ride + ", fuel=" + fuel + "]";
	}
	

}
