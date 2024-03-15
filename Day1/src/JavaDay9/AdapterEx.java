package JavaDay9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AdapterEx extends Frame implements ActionListener {

	Panel p1, p2, p3;
	Button b1, b2;
	TextField tf;
	TextArea ta;

	public AdapterEx() {
		super("Adapter Exam");
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();

		tf = new TextField(35);
		ta = new TextArea(10, 35);

		b1 = new Button("Clear");
		b2 = new Button("Exit");

		b1.addActionListener(this); // 이벤트 소스와 이벤트 핸들러 연결
		b2.addActionListener(this);
		
		

		tf.addKeyListener(new Clear() { //anonymous inner class
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText()+"\n");
					tf.setText("");
				}
			}
		});

		addWindowListener(new WindowAdapter() { //anonymous inner class
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		p1.add(b1);
		p1.add(b2);

		p2.add(tf);
		p3.add(ta);

		add("South", p1);
		add("North", p2);
		add("Center", p3);

		setBounds(300, 200, 300, 300);
		setVisible(true);

	}

	public class Clear extends KeyAdapter { //member inner class

		public void keyTyped(KeyEvent e) {
			if (e.getKeyChar() == KeyEvent.VK_ENTER) {
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}
		}
	}

	public void actionPerformed(ActionEvent ae) {
		String name;
		name = ae.getActionCommand();

		if (name.equals("Clear")) {
			ta.setText("");
			tf.setText("");
			tf.requestFocus();
		} else if (name.equals("Exit")) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new AdapterEx();

	}

}
