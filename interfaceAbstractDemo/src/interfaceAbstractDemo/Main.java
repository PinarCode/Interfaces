package interfaceAbstractDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"P�nar","Kaya",LocalDate.of(1996, 01, 14),"12345678925"));

	}

}
