package com.mypc.sony;

public class ThePc {
private Case theCase;
private  Monitor monitor;
private Motherboard motherboard;
public ThePc(Case theCase, Monitor monitor, Motherboard motherboard) {
	this.theCase = theCase;
	this.monitor = monitor;
	this.motherboard = motherboard;
}
/*private Case getTheCase() {
	return theCase;
}
private Monitor getMonitor() {
	return monitor;
}
private Motherboard getMotherboard() {
	return motherboard;
}
*/

public void powerUp(){
	theCase.pressPowerButton();
	drawLogo();
}
public void drawLogo(){
	//code for the logo graphics.
	monitor.drawPixelAt(1200, 1500, "red");
	biosStartUp();
}

private void biosStartUp() {
	motherboard.loadProgram("Windows 10.0");
}



}
