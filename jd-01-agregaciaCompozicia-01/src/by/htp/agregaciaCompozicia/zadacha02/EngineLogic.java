package by.htp.agregaciaCompozicia.zadacha02;

import java.util.List;
import java.util.Scanner;

public class EngineLogic {
Scanner sc=new Scanner(System.in);
	public void zapravka(List<Avto> ls){
		for(int i=0;i<ls.size();i++){
			
				if(ls.get(i).e.getFuel()==0){
					System.out.println("\n"+ls.get(i).getName()+" - ���������� ���������. ������� ������� ������?");
					ls.get(i).e.setFuel(sc.nextInt());
					
				}
			
		}
	}
}
