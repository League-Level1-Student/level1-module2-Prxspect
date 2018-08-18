import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave mc = new Microwave();
	String pcflavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
	Popcorn pc = new Popcorn(pcflavor);
	String cook = JOptionPane.showInputDialog("How long will it take to cook your popcorn (minutes)?");
	int cooktime = Integer.parseInt(cook);
	mc.setTime(cooktime);
	mc.putInMicrowave(pc);
	pc.applyHeat();
	mc.startMicrowave();
	pc.eat();
	
}
}
