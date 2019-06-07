package by.htp.agregaciaCompozicia.zadacha04;

import java.util.List;

public class RsLogic {
	public void sortByMoney(List<RS> ls) {
		RS x;
		for(int i=0;i<ls.size();i++) {
			for(int p=i+1;p<ls.size();p++) {
				if(ls.get(i).balans>ls.get(p).balans) {
					x=ls.get(i);
					ls.set(i, ls.get(p));
					ls.set(p,x);
				}
			}
		}
		for(int i=0;i<ls.size();i++) {
		System.out.println(ls.get(i).nameOrg+" "+ls.get(i).name+" "+ls.get(i).number+" "+ls.get(i).activ+" "+ls.get(i).balans);
		}
	}
	

}
