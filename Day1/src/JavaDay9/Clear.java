package JavaDay9;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Clear extends KeyAdapter {
	TextField tf;
	TextArea ta;
	
	public Clear(TextField tf, TextArea ta) {
		this.tf = tf;
		this.ta = ta;
	}
	
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar() == KeyEvent.VK_ENTER) {
			ta.append(tf.getText()+"\n");
			tf.setText("");
		}
	}
}
