package by.htp.agregaciaCompozicia.zadacha03;

import java.util.ArrayList;
import java.util.List;

public class Region extends Obl{
	
	String nameRegion;

	public String getNameRegion() {
		return nameRegion;
	}

	public void setNameRegion(String nameRegion) {
		this.nameRegion = nameRegion;
	}
	
	public void listCitybyRegion(List<City> ct){
		List<String> ct1=new ArrayList<String>();
		for(int p=0;p<ct.size();p++){
			
			for(int i=0;i<ct.size();i++){
				if(ct.get(p).getNameRegion()==ct.get(i).getNameRegion())
			ct1.add(ct.get(p).getNameRegion()+" "+ct.get(i).getCity());
			}
		}
		for(int p=0;p<ct.size();p++){
			System.out.println(ct1.get(p));
		}
		
	}
	
}
