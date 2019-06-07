package by.htp.agregaciaCompozicia.zadacha01;

import java.util.Scanner;



public class word {
	private String word;
	Scanner sc=new Scanner(System.in);
	
	public word(String word) {
		this.word=word;
		}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	public String dopWord(){
		System.out.println("Введите слово, которое вы хотите добавить в текст");
		return sc.nextLine();
	}

}
