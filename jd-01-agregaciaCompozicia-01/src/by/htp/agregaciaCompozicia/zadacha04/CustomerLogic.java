package by.htp.agregaciaCompozicia.zadacha04;

import java.util.List;
import java.util.Scanner;

public class CustomerLogic {
	Scanner sc=new Scanner(System.in);
	
	public void blockRS(List<RS> ls){
		
		System.out.println("Введите ФИО клиента для блокировки");
		String x=sc.nextLine();
		System.out.println("Введите номер счета клиента для блокировки");
		int y=sc.nextInt();
		for(int i=0;i<ls.size();i++){
			if(ls.get(i).name.equals(x)){
				if(ls.get(i).number==y){
					if(ls.get(i).activ==true){
					ls.get(i).activ=false;
					System.out.println("Счет номер "+ls.get(i).number+" принадлежащий "+ls.get(i).name+" заблокирован \n");
					break;
					}
					else{
						System.out.println("Данный счет уже был заблокирован");
						continue;
					}
				}
			else{
				if(i==ls.size()-1) {
					System.out.println("Введены неверные данные.Операция прервана.");
				}
				
				continue;
			}
			}
			else {
				if(i==ls.size()-1) {
					System.out.println("Введены неверные данные.Операция прервана.");
				}
				continue;
			}
		}
	}
	
	public void unBlockRS(List<RS> ls){
		
		System.out.println("Введите ФИО клиента для разблокировки"+sc.nextLine());
		String a=sc.nextLine();
		System.out.println("Введите номер счета клиента для разблокировки");
		int b=sc.nextInt();
		for(int i=0;i<ls.size();i++){
			if(ls.get(i).name.equals(a)){
				if(ls.get(i).number==b){
					if(ls.get(i).activ==false){
						ls.get(i).activ=true;
						System.out.println("Счет номер "+ls.get(i).number+" принадлежащий "+ls.get(i).name+" разблокирован \n");
						break;
					}
					else{
						System.out.println("Данный счет не был заблокирован");
						continue;
					}
				}
			else{
				if(i==ls.size()-1) {
					System.out.println("Введены неверные данные.Операция прервана.");
				}
				
				continue;
			}
			}
			else {
				if(i==ls.size()-1) {
					System.out.println("Введены неверные данные.Операция прервана.");
				}
				continue;
			}
		}
	}
	
	public void summRScustomer(List<RS> ls) {
		System.out.println("Введите ФИО клиента "+sc.nextLine());
		String a=sc.nextLine();
		int x=0;
		int y=0;
		for(int i=0;i<ls.size();i++) {
			
			if(ls.get(i).name.equals(a)) {
				if(ls.get(i).balans>=0) {
				x=x+ls.get(i).balans;
				}
				else {
				y=y+ls.get(i).balans;
				}
			}
		}
		System.out.println("Общий баланс у "+a+" = "+x);
		System.out.println("Общая задолженность у "+a+" = "+y);
	}
	
}
