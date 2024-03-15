package JavaDay9;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExitAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}
}
