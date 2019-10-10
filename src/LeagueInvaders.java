import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvaders {
	
	JFrame frame;
	final int w = 500;
	final int h = 800;
	
	public static void main(String[] args) {
		
		LeagueInvaders game = new LeagueInvaders();
		game.setup();
		
	}
	
	LeagueInvaders() {
		
		frame = new JFrame();
		
	}
	
	void setup() {
		
		JPanel panel = new JPanel();
		
		frame.add(panel);
		frame.show();
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
