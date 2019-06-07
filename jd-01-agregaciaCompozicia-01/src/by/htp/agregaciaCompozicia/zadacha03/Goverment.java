package by.htp.agregaciaCompozicia.zadacha03;

import java.util.ArrayList;
import java.util.List;

public class Goverment {

	
	public void centralCity(List<City> ct){
		for(int i=0;i<ct.size();i++){
		if(ct.get(i).isCentralCity()==true){
			System.out.println("Столица государства - "+ct.get(i).getCity());
		}
		}
	}
	
	public void govermentSquare(List<City> ct){
		int x=0;
		for(int i=0;i<ct.size();i++){
			x=x+ct.get(i).getSquare();
				
			}
		System.out.println("Площадь государства="+x);
	}

	

}
