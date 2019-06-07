package by.htp.agregaciaCompozicia.zadacha04;

import java.util.ArrayList;
import java.util.List;

public class Zadacha04 {
	/*
	 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
	 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
	 * Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
	 * положительный и отрицательный балансы отдельно.
	 */

	public static void main(String[] args) {
		List<RS> ls=new ArrayList<RS>();
		ls.add(new RS("BelarusBank","Иванов Иван Иванович",1,true,150));
		ls.add(new RS("BelarusBank","Иванов Иван Иванович",2,true,250));
		ls.add(new RS("BelarusBank","Петров Петр Петрович",1,false,0));
		ls.add(new RS("BelarusBank","Сидоров Антон Георгиевич",1,true,350));
		ls.add(new RS("BelarusBank","Сидоров Антон Георгиевич",2,true,450));
		ls.add(new RS("BelarusBank","Сидоров Антон Георгиевич",3,true,550));
		ls.add(new RS("BelarusBank","Пушкин Иван Иванович",1,false,-150));
		ls.add(new RS("BelarusBank","Пушкин Иван Иванович",2,true,50));
		
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
