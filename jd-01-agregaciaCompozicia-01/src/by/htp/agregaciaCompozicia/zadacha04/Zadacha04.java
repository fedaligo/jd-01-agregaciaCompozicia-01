package by.htp.agregaciaCompozicia.zadacha04;

import java.util.ArrayList;
import java.util.List;

public class Zadacha04 {
	/*
	 * 4. �����. ������ ����� ����� ��������� ������ � �����. ��������� �����������
	 * ����������/������������� �����. ����������� ����� � ���������� ������.
	 * ���������� ����� ����� �� ������. ���������� ����� �� ���� ������, �������
	 * ������������� � ������������� ������� ��������.
	 */

	public static void main(String[] args) {
		List<RS> ls=new ArrayList<RS>();
		ls.add(new RS("BelarusBank","������ ���� ��������",1,true,150));
		ls.add(new RS("BelarusBank","������ ���� ��������",2,true,250));
		ls.add(new RS("BelarusBank","������ ���� ��������",1,false,0));
		ls.add(new RS("BelarusBank","������� ����� ����������",1,true,350));
		ls.add(new RS("BelarusBank","������� ����� ����������",2,true,450));
		ls.add(new RS("BelarusBank","������� ����� ����������",3,true,550));
		ls.add(new RS("BelarusBank","������ ���� ��������",1,false,-150));
		ls.add(new RS("BelarusBank","������ ���� ��������",2,true,50));
		
		CustomerLogic c=new CustomerLogic();
		c.blockRS(ls);
		c.unBlockRS(ls);
		c.summRScustomer(ls);
		
		RsLogic rl=new RsLogic();
		rl.sortByMoney(ls);
		
		BankLogic bl=new BankLogic();
		bl.summRSbank(ls);

	}

}
