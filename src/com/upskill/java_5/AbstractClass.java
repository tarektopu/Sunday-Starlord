package com.upskill.java_5;

public abstract class AbstractClass {

	//Abstract class has both abstract method and regular method
	
	public void car(){
		System.out.println("My car is Ionic5");
	}
	
	public abstract void iDoor();
	
	public abstract String iColor();
	
	public abstract int iWheel();
	
	public abstract void iSeat();

}

/*
(Parent)					(Keyword) 				(Child) 			  (keyword) 			  (GrandChild)

Class						extends					Class
Abstract Class(2)			extends					Class (2->0)
Interface(2)				implements				Class (2->0)
Interface(2)				extends					Interface (2+2)		   implements			 Class (4->0)
Interface(2)				implements				Abstract Class(2->0)

*/