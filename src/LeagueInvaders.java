import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvaders {
	
	final static int w = 500;
	final static int h = 800;
	
	JFrame frame;
	GamePanel panel;
	
	public static void main(String[] args) {
		
		LeagueInvaders game = new LeagueInvaders();
		game.setup();
		
	}
	
	LeagueInvaders() {
		
		frame = new JFrame();
		panel = new GamePanel();
		
	}
	
	void setup() {
		
		frame.getContentPane().setPreferredSize(new Dimension(w,h));
		frame.show();
		frame.add(panel);
		frame.addKeyListener(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.startGame();
		
	}
}
