package JavaDay9;
import java.awt.*;

public class CheckBoxEx {

	public static void main(String[] args) {
		Frame f = new Frame("CheckBox Test");  
		
		Panel p =new Panel();
		
		Button b1 = new Button("Let's Start!");
		TextField tf1 = new TextField("What is your name? : ", 30);
		CheckboxGroup group = new CheckboxGroup();
		Checkbox ck1 = new Checkbox("March", group, true);
		Checkbox ck2 = new Checkbox("April", group, false);
		Checkbox ck3 = new Checkbox("May", group, false);
		
		tf1.selectAll();
		
		p.add(b1);
		p.add(tf1);
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
	
		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
		
	}

}
