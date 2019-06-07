package by.htp.agregaciaCompozicia.zadacha02;

import java.util.List;

public class AvtoLogic{
	

	public void goAvto(List<Avto> ls){
		
		WheelLogic wl=new WheelLogic();
		wl.changeWhile(ls);
		
		EngineLogic el=new EngineLogic();
		el.zapravka(ls);
		
		for(int i=0;i<ls.size();i++){
			int x=0;
			for(int p=0;p<ls.get(i).w.getInstWheel().length;p++){
				if(ls.get(i).w.getInstWheel()[p]==false){
					System.out.println(ls.get(i).getName()+" - не поедет, так как не установлено как минимум одно колесо");
					x=x+1;
					break;
				}
			}
			
				
				for(int p=0;p<ls.get(i).w.getDamage().length;p++){	
					if(ls.get(i).w.getDamage()[p]==true){
						System.out.println(ls.get(i).getName()+" - не поедет, так как пробито как минимум одно колесо");
						x=x+1;
						break;
					}
				}	
				
			
				
				if(ls.get(i).e.getFuel()==0){
						System.out.println(ls.get(i).getName()+" - не поедет");
						x=x+1;
				}
			
						
				if(ls.get(i).e.isRide()==false){
						System.out.println(ls.get(i).getName()+" - не поедет");
						x=x+1;
				}
			
			if(x==0){					
				System.out.println(ls.get(i).getName()+" - поедет");
			}				
		}
	}
	
}
					
				
			
			
		
	

