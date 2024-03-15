package JavaDay9;
import java.awt.*;

public class ButtonEx {

	public static void main(String[] args) {
		Frame f = new Frame("Button Test"); //frame은 항상 먼저 객체 생성해줘야한다. 
		
		Panel p =new Panel();
		
		Button b1 = new Button();
		Button b2 = new Button("is");
		Button b3 = new Button("the");
		Button b4 = new Button("button");
		
		b1.setLabel("This");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		f.add(p);
		
		f.setLocation(300,300);
		f.setSize(300,100);
		f.setVisible(true);
		
		

	}

}
