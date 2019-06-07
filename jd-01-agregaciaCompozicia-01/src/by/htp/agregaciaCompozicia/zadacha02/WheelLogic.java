package by.htp.agregaciaCompozicia.zadacha02;

import java.util.List;
import java.util.Scanner;

public class WheelLogic {
	Scanner sc=new Scanner(System.in);
	public void changeWhile(List<Avto> ls){
		for(int i=0;i<ls.size();i++){
			
			int y;
			int x=1;
			for(int p=0;p<ls.get(i).w.getDamage().length;p++){	
				if(ls.get(i).w.getDamage()[p]==true){
					if(x==1){
						System.out.println("\n в "+ls.get(i).getName()+" пробито колесо! заменить колесо? \n 1.да \n 2.нет \n");
						y=sc.nextInt();
						if(y==1){
						ls.get(i).w.getDamage()[p]=false;
						System.out.println("в "+ls.get(i).getName()+" заменено 1 пробитое колесо");
						x=x-1;
						}
						else{
							System.out.println("Пробитое колесо не было заменено!");
						}
					}
					else{
						System.out.println("Невозможно заменить ещё одно пробитое колесо, так как нет запасного!");
						break;
						}
				}
			}	
		}
	}
}
