package by.htp.agregaciaCompozicia.zadacha01;

import java.util.ArrayList;
import java.util.List;


public class Zadacha01 {
	/*
	 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы:
	 * дополнить текст, вывести на консоль текст, заголовок текста.
	 */

	public static void main(String[] args) {
		word wd1=new word("привет!");
		word wd2=new word("спасибо");
		word wd3=new word("нормально");
		word wd4=new word("разговор");
		word wd5=new word("солнце");
		
		predlog pr1=new predlog("как дела?");
		predlog pr2=new predlog("что видишь?");
		pr1.setZagolovok("ПРОСТОЙ РАЗГОВОР");
		
		List<String> ls=new ArrayList<String>();
		ls.add("заголовок:"+pr1.getZagolovok());
		ls.add("-"+wd1.getWord()+" "+pr1.getPredlog());
		ls.add("-"+wd3.getWord());
		ls.add("-"+pr2.getPredlog());
		ls.add("-"+wd5.getWord());
		
		
		text t1=new text(ls);
		
		t1.displayText(ls);
		
		ls.set(1, pr1.dopPredlog());
		ls.set(2, wd5.dopWord());
		
		t1.displayText(ls);
	}

}
