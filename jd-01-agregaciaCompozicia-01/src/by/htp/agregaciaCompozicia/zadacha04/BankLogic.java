package by.htp.agregaciaCompozicia.zadacha04;

import java.util.List;

public class BankLogic {
	public void summRSbank(List<RS> ls) {
		int x=0;
		int y=0;
		for(int i=0;i<ls.size();i++) {
			if(ls.get(i).balans>=0) {
				x=x+ls.get(i).balans;
			}
			else {
				y=y+ls.get(i).balans;
			}
		}
		System.out.println("Общий баланс за банк = "+x);
		System.out.println("Общая задолженность за банк = "+y);
	}

}
