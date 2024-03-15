package JavaDay9;
import java.awt.*;

public class CardLayoutEx extends Frame {
	CardLayout card;
	Panel first_panel, second_panel, third_panel;
	
	
	public CardLayoutEx() {
		super("Kookmin Bank");
		
		card = new CardLayout();
		setLayout(card);
		
		first_panel = new Panel();
		first_panel.add(new Button("DIGI"));
		first_panel.add(new Button("Campus"));

		second_panel = new Panel();
		second_panel.add(new Button("JA"));
		second_panel.add(new Button("VA"));
		
		third_panel = new Panel();
		third_panel.add(new Button("TODAY"));
		third_panel.add(new Button("2024-03-15"));
		
		add("1", first_panel);
		add("2", second_panel);
		add("3", third_panel);
		
	}
	
	public void rotate() {
		for(int i=0; i<2; i++) {
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			card.next(this);
		}
	}
	
	public static void main(String[] args) {
		CardLayoutEx clt = new CardLayoutEx();
		
		clt.setBounds(500,500,500,100);
		clt.setVisible(true);
		
		clt.rotate();
	}

}
