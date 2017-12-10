package com.mypc.sony;

public class Main {
public static void main(String[] args) {
	
	
	Dimensions dimensions=new Dimensions(20, 20, 5);
	Case theCase=new Case("2200", "Sony", "340", dimensions);
	
	Monitor monitor=new Monitor("i220", "Acer", 23, new Resolution(2540, 1440));
	Motherboard motherboard =new Motherboard("BJ-200", "Toshiba", 2, 6, "v2-44");
	
	ThePc pc=new ThePc(theCase, monitor, motherboard);
/*	pc.getTheCase().pressPowerButton();
	pc.getMonitor().drawPixelAt(1544, 1200, "red");
	pc.getMotherboard().loadProgram("Windows 10.0");*/
	
	pc.powerUp();
}
}
