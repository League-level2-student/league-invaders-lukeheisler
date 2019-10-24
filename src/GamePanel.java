import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Timer timer;

	GamePanel() {
		
		timer = new Timer(1000/60, this);
		
	}
	
	void startGame() {
		
		timer.start();
		
	}
	
	void updateMenuState() {
		
	}
	
	void updateGameState() {
		
	}
	
	void updateEndState() {
		
	}
	
	void drawMenuState(Graphics g) {
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.w, LeagueInvaders.h);
		
	}
	
	void drawGameState(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.w, LeagueInvaders.h);
		
	}
	
	void drawEndState(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.w, LeagueInvaders.h);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(currentState) {
			case MENU_STATE:
				updateMenuState();
			case GAME_STATE:
				updateGameState();
			case END_STATE:
				updateEndState();
		}
		repaint();
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		switch(currentState) {
			case MENU_STATE:
				drawMenuState(g);
			case GAME_STATE:
				drawGameState(g);
			case END_STATE:
				drawEndState(g);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if(keyCode == KeyEvent.VK_ENTER) {
			if(currentState > END_STATE) {
				currentState = MENU_STATE;
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {

		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

		
		
	}
	
}
