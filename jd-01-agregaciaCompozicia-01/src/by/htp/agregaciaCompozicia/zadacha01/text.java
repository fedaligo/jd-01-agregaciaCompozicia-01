package by.htp.agregaciaCompozicia.zadacha01;

import java.util.ArrayList;
import java.util.List;


public class text {
	List<String> ls=new ArrayList<String>();
	word wd;
	predlog pr;
	public text(List<String> ls){
		this.ls=ls;
		
	}
	public void displayText(List<String> ls){
	System.out.println("Ваш текст:");
	for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
}

}
