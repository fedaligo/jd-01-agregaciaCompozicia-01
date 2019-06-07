package by.htp.agregaciaCompozicia.zadacha02;

import java.util.ArrayList;
import java.util.List;

public class Zadacha02 {
	/*
	 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
	 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку
	 * автомобиля.
	 */

	public static void main(String[] args) {
		
		List<Avto> ls=new ArrayList<Avto>();
		ls.add(new Avto("volvo",new boolean[]{true,true,true,true},new boolean[]{true,true,true,true},true,100));
		ls.add(new Avto("audi",new boolean[]{true,true,true,true},new boolean[]{false,false,false,false},true,15));
		ls.add(new Avto("vw",new boolean[]{false,false,false,false},new boolean[]{false,false,false,false},true,10));
		ls.add(new Avto("ferrari",new boolean[]{true,true,true,true},new boolean[]{false,true,false,false},true,0));
		ls.add(new Avto("maz",new boolean[]{false,false,false,true},new boolean[]{false,true,false,true},true,200));
		
		//EngineLogic el=new EngineLogic();
		AvtoLogic al=new AvtoLogic();
		//el.zapravka(ls);
		al.goAvto(ls);
		
		
		

	}

}
