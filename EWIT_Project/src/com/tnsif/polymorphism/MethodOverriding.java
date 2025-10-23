package com.tnsif.polymorphism;

class Payment{
	void makePayment() {
		System.out.println("Processing payment using generic method");
		
	}
}
class UpiPayment extends Payment{
	void makePayment() {
		System.out.println("Payment made using upi");
	}
}

class CardPayment extends Payment{
	void makePayment() {
		System.out.println("Payment made using Credit/Debit Card");
	}
}

class CashPayment extends Payment{
	void makePayment() {
		System.out.println("Payment made using Cash");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		Payment c;
		c = new CardPayment();
		c.makePayment();
		
		c = new UpiPayment();
		c.makePayment();
		
		c = new CashPayment();
		c.makePayment();
		
		c1 a;
		a = new c2();
		a.show();
	}

}


class c1{
	void show() {
		System.out.println("I'll Not show");
	}
	
}

class c2 extends c1{
	void show() {
		System.out.println("I'll Show!");
	}
}
