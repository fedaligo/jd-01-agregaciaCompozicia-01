package by.htp.agregaciaCompozicia.zadacha03;

import java.util.ArrayList;
import java.util.List;

public class Zadacha03 {
	/*
	 * 3. Создать объект класса Государство, используя классы Область, Район, Город.
	 * Методы: вывести на консоль столицу, количество областей, площадь, областные
	 * центры.
	 */

	public static void main(String[] args) {
		List<City> ct=new ArrayList<City>();
		ct.add(new City("mogilevskaya",150,"mstRegion","krichev",false,false));
		ct.add(new City("minskaya",250,"minskRegion","minsk",true,true));	
		ct.add(new City("mogilevskaya",150,"mstRegion","mst",false,false));
		ct.add(new City("gomelskaya",200,"gomelRegion","kalduni",false,false));
		ct.add(new City("minskaya",250,"berezinoRegion","berezino",false,false));
		ct.add(new City("gomelskaya",200,"gomelRegion","gomel",false,true));
		
		Region rg=new Region();
		rg.listCitybyRegion(ct);
		
		Goverment gv=new Goverment();
		gv.centralCity(ct);
		gv.govermentSquare(ct);
		
		Obl o=new Obl();
		o.castofObl(ct);
		o.centralCityofObl(ct);
	}

}
