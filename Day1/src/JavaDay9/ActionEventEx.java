package JavaDay9;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Exit extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}



public class ActionEventEx extends Frame implements ActionListener {
	Panel p;
	Button input, exit;
	TextArea ta;
	
	public ActionEventEx() {
		super("ActionEvent Test");
		p = new Panel();
		input = new Button("input");
		exit = new Button("exit");
		ta = new TextArea();
	
		input.addActionListener(this); //이벤트 소스와 이벤트 핸들러 연결
		exit.addActionListener(this);
		
		addWindowListener(new Exit()); // Frame을 상속받아서 바로 써도 된다. //(Adapter를 상속받은) Exit 객체를 생성하여 리스너에게 전달해줘야 한다. 
		
		p.add(input);
		p.add(exit);
		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		setBounds(300,300,300,200);
		setVisible(true);
		
	}


	public void actionPerformed(ActionEvent ae) {
		String name;
		name = ae.getActionCommand();
		
		if(name.equals("input")) {
			ta.append("button input. \n");
		}else if(name.equals("exit")){
			ta.append("exit. \n");
			try {
				Thread.sleep(2000);
			}catch(Exception e){
				
			}
			
			System.exit(0); // catch문 안에 들어가면 오류남!!
		}
	}
	
//	@Override
//	public void windowOpened(WindowEvent e) {
//		
//	}
//	
//	public void windowClosing(WindowEvent e) {
//		System.exit(0);
//	}
//
//	public void windowClosed(WindowEvent e) {
//	
//	}
//
//	public void windowIconified(WindowEvent e) {
//	
//	}
//
//	public void windowDeiconified(WindowEvent e) {
//	
//	}
//
//	public void windowActivated(WindowEvent e) {
//	
//	}
//	
//	public void windowDeactivated(WindowEvent e) {
//		 
//	}
	
	public static void main(String[] args) {
		new ActionEventEx();
	}

}
