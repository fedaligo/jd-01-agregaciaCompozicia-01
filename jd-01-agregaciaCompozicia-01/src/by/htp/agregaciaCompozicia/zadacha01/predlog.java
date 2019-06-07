package by.htp.agregaciaCompozicia.zadacha01;

import java.util.Scanner;

public class predlog {
	private String predlog;
	private String zagolovok;
	Scanner sc=new Scanner(System.in);
	
	public predlog(String predlog) {
		this.predlog=predlog;
	}
	public String getPredlog() {
		return predlog;
	}
	public void setPredlog(String predlog) {
		this.predlog = predlog;
	}
	public String getZagolovok() {
		return zagolovok;
	}
	public void setZagolovok(String zagolovok) {
		this.zagolovok = zagolovok;
	}
	public String dopPredlog(){
		System.out.println("Введите прдложение, которое вы хотите добавить в текст");
		return sc.nextLine();
	}
	
}
