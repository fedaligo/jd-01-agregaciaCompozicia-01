package by.htp.agregaciaCompozicia.zadacha01;

import java.util.ArrayList;
import java.util.List;


public class Zadacha01 {
	/*
	 * 1. ������� ������ ������ �����, ��������� ������ �����������, �����. ������:
	 * ��������� �����, ������� �� ������� �����, ��������� ������.
	 */

	public static void main(String[] args) {
		word wd1=new word("������!");
		word wd2=new word("�������");
		word wd3=new word("���������");
		word wd4=new word("��������");
		word wd5=new word("������");
		
		predlog pr1=new predlog("��� ����?");
		predlog pr2=new predlog("��� ������?");
		pr1.setZagolovok("������� ��������");
		
		List<String> ls=new ArrayList<String>();
		ls.add("���������:"+pr1.getZagolovok());
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
