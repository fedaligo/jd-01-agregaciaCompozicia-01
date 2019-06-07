package by.htp.agregaciaCompozicia.zadacha03;

import java.util.ArrayList;
import java.util.List;

public class Obl extends Goverment{
	String nameObl;
	int square;
	
	
	public String getNameObl() {
		return nameObl;
	}
	public void setNameObl(String nameObl) {
		this.nameObl = nameObl;
	}
	public int getSquare() {
		return square;
	}
	public void setSquare(int square) {
		this.square = square;
	}
	
	public void castofObl(List<City> ct){
		int x=0;
		for(int i=0;i<ct.size();i++){
			if(i==ct.size()-1){
				x=x+1;
			}
			for(int p=i+1;p<ct.size();p++){
				
				if(ct.get(i).getNameObl()==ct.get(p).getNameObl()){
					break;
				}
				else{
					if(p==ct.size()-1){
						x=x+1;
					}
				}
			}
		}
		System.out.println("количество областей="+x);
	}
	
	public void centralCityofObl(List<City> ct){
		
		for(int i=0;i<ct.size();i++){
			if(ct.get(i).isOblCenter()==true){
				System.out.println("Областной центр в "+ct.get(i).getNameObl()+" области город - "+ct.get(i).getCity());
			}
			
		}
		
	}
}
