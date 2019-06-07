package by.htp.agregaciaCompozicia.zadacha05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerLogic {
	Scanner sc=new Scanner(System.in);
	
	
	public void podbor(List<travelDoc> ls) {
		List<travelDoc> ls1=new ArrayList<travelDoc>();
		List<travelDoc> ls2=new ArrayList<travelDoc>();
		List<travelDoc> ls3=new ArrayList<travelDoc>();
		List<travelDoc> ls4=new ArrayList<travelDoc>();
		System.out.println("Введите тип транспорта (пешком,велосипед,автобус,самолет,корабль)");
		String typeTransport=sc.next();
		System.out.println("Введите клоличество дней(7,14,21)");
		int countOfDays=sc.nextInt();
		System.out.println("Введите тип путешествия(отдых, экскурсии, лучение, шопинг, круиз)");
		String type=sc.next();
		System.out.println("Введите тип питания(всё включено, только завтраки, толко ужины, завтраки и ужины)"+sc.nextLine());
		String typeEat=sc.nextLine();
		for(int i=0;i<ls.size();i++) {
		if(typeTransport.equals(ls.get(i).typeTransport)) {
			if(typeEat.equals(ls.get(i).typeEat)) {
				if(countOfDays==ls.get(i).countOfDays) {
					if(type.equals(ls.get(i).type)) {
						ls1.add(ls.get(i));
						//System.out.println("Полностью подходящий вариант \n"+ls.get(i));
					}
				}
			}
		}
		
		if(typeTransport.equals(ls.get(i).typeTransport)) {
			if(typeEat.equals(ls.get(i).typeEat)) {
				if(countOfDays==ls.get(i).countOfDays) {
					ls2.add(ls.get(i));
						//System.out.println("Подходящий вариант только по транспорту, еде и дням \n"+ls.get(i));
					
				}
			}
		}
		
		if(typeTransport.equals(ls.get(i).typeTransport)) {
			if(typeEat.equals(ls.get(i).typeEat)) {
				ls3.add(ls.get(i));		
				//System.out.println("Подходящий вариант только по транспорту и еде \n"+ls.get(i));
			}
		}
		
		if(typeTransport.equals(ls.get(i).typeTransport)) {
			ls4.add(ls.get(i));			
			//System.out.println("Подходящий вариант только по транспорту \n"+ls.get(i));
		}
		}
			System.out.println("Полностью подходящий вариант");
			for(int i=0;i<ls1.size();i++) {
			System.out.println(ls1.get(i));
			}
			
			System.out.println("Подходящий вариант только по транспорту, еде и дням");
			for(int i=0;i<ls1.size();i++) {
			System.out.println(ls1.get(i));
			}
			
			System.out.println("Подходящий вариант только по транспорту и еде");
			for(int i=0;i<ls1.size();i++) {
			System.out.println(ls1.get(i));
			}
			
			System.out.println("одходящий вариант только по транспорту");
			for(int i=0;i<ls1.size();i++) {
			System.out.println(ls1.get(i));
			}
	}

}
