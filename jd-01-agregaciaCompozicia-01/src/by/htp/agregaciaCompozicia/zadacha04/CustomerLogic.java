package by.htp.agregaciaCompozicia.zadacha04;

import java.util.List;
import java.util.Scanner;

public class CustomerLogic {
	Scanner sc=new Scanner(System.in);
	
	public void blockRS(List<RS> ls){
		
		System.out.println("������� ��� ������� ��� ����������");
		String x=sc.nextLine();
		System.out.println("������� ����� ����� ������� ��� ����������");
		int y=sc.nextInt();
		for(int i=0;i<ls.size();i++){
			if(ls.get(i).name.equals(x)){
				if(ls.get(i).number==y){
					if(ls.get(i).activ==true){
					ls.get(i).activ=false;
					System.out.println("���� ����� "+ls.get(i).number+" ������������� "+ls.get(i).name+" ������������ \n");
					break;
					}
					else{
						System.out.println("������ ���� ��� ��� ������������");
						continue;
					}
				}
			else{
				if(i==ls.size()-1) {
					System.out.println("������� �������� ������.�������� ��������.");
				}
				
				continue;
			}
			}
			else {
				if(i==ls.size()-1) {
					System.out.println("������� �������� ������.�������� ��������.");
				}
				continue;
			}
		}
	}
	
	public void unBlockRS(List<RS> ls){
		
		System.out.println("������� ��� ������� ��� �������������"+sc.nextLine());
		String a=sc.nextLine();
		System.out.println("������� ����� ����� ������� ��� �������������");
		int b=sc.nextInt();
		for(int i=0;i<ls.size();i++){
			if(ls.get(i).name.equals(a)){
				if(ls.get(i).number==b){
					if(ls.get(i).activ==false){
						ls.get(i).activ=true;
						System.out.println("���� ����� "+ls.get(i).number+" ������������� "+ls.get(i).name+" ������������� \n");
						break;
					}
					else{
						System.out.println("������ ���� �� ��� ������������");
						continue;
					}
				}
			else{
				if(i==ls.size()-1) {
					System.out.println("������� �������� ������.�������� ��������.");
				}
				
				continue;
			}
			}
			else {
				if(i==ls.size()-1) {
					System.out.println("������� �������� ������.�������� ��������.");
				}
				continue;
			}
		}
	}
	
	public void summRScustomer(List<RS> ls) {
		System.out.println("������� ��� ������� "+sc.nextLine());
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
		System.out.println("����� ������ � "+a+" = "+x);
		System.out.println("����� ������������� � "+a+" = "+y);
	}
	
}
