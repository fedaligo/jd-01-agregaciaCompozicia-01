package by.htp.agregaciaCompozicia.zadacha05;

import java.util.ArrayList;
import java.util.List;

public class Zadacha05 {
	/*
	 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору
	 * туристической путевки различного типа (отдых, экскурсии, лечение, шопинг,
	 * круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
	 * транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
	 */
	public static void main(String[] args) {
		
		List<travelDoc> ls=new ArrayList<travelDoc>();
		ls.add(new travelDoc("SpainTravel","отдых","самолёт","всё включено",7));
		ls.add(new travelDoc("SpainTravel","отдых","самолёт","всё включено",14));
		ls.add(new travelDoc("SpainTravel","отдых","самолёт","всё включено",21));
		
		ls.add(new travelDoc("SpainTravel","экскурсии","автобус","только завтраки",7));
		ls.add(new travelDoc("SpainTravel","экскурсии","велосипед","завтраки и ужины",14));
		ls.add(new travelDoc("SpainTravel","экскурсии","пешком","всё включено",21));
		
		ls.add(new travelDoc("SpainTravel","лечение","автобус","всё включено",7));
		ls.add(new travelDoc("SpainTravel","лечение","самолёт","всё включено",7));
		ls.add(new travelDoc("SpainTravel","лечение","самолёт","завтраки и ужины",14));
		
		ls.add(new travelDoc("SpainTravel","шопинг","автобус","всё включено",7));
		ls.add(new travelDoc("SpainTravel","шопинг","самолёт","всё включено",7));
		
		ls.add(new travelDoc("SpainTravel","круиз","корабль","всё включено",7));
		ls.add(new travelDoc("SpainTravel","круиз","корабль","всё включено",14));
		ls.add(new travelDoc("SpainTravel","круиз","корабль","всё включено",21));
		ls.add(new travelDoc("SpainTravel","круиз","корабль","завтраки и ужины",7));
		ls.add(new travelDoc("SpainTravel","круиз","корабль","завтраки и ужины",14));
		ls.add(new travelDoc("SpainTravel","круиз","корабль","завтраки и ужины",21));
		
		CustomerLogic cl=new CustomerLogic();
		cl.podbor(ls);
	}

}
