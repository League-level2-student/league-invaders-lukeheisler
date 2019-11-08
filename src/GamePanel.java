import java.awt.Color;
import java.awt.Font;
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
	Font titleFont;
	Font subtitleFont;
	Rocketship rocketship = new Rocketship(250, 700, 50, 50);
	ObjectManager objectManager = new ObjectManager(rocketship);

	GamePanel() {
		
		timer = new Timer(1000/60, this);
		titleFont = new Font("Arial", Font.BOLD, 48);
		subtitleFont = new Font("Arial", Font.PLAIN, 24);
		
	}
	
	void startGame() {
		
		timer.start();
		
	}
	
	void updateMenuState() {
		
	}
	
	void updateGameState() {
		
		objectManager.update();
		
	}
	
	void updateEndState() {
		
	}
	
	void drawMenuState(Graphics g) {
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.w, LeagueInvaders.h);
		g.setColor(Color.YELLOW);
		g.setFont(titleFont);
		g.drawString("League Invaders", 60, 100);
		g.setFont(subtitleFont);
		g.drawString("Please press ENTER to begin.", 80, 350);
		g.drawString("Please press SPACE to view instructions.", 30, 500);
		
	}
	
	void drawGameState(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.w, LeagueInvaders.h);
		objectManager.draw(g);
		
	}
	
	void drawEndState(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.w, LeagueInvaders.h);
		g.setColor(Color.BLACK);
		g.setFont(titleFont);
		g.drawString("Sorry, game over!", 45, 100);
		g.setFont(subtitleFont);
		g.drawString("You were able to damage " + " enemy skyships.", 20, 350);
		g.drawString("Please press ENTER to play again.", 60, 500);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(currentState) {
			case MENU_STATE:
				updateMenuState();
				break;
			case GAME_STATE:
				updateGameState();
				break;
			case END_STATE:
				updateEndState();
				break;
		}
		repaint();
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		switch(currentState) {
			case MENU_STATE:
				drawMenuState(g);
				break;
			case GAME_STATE:
				drawGameState(g);
				break;
			case END_STATE:
				drawEndState(g);
				break;
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		if(keyCode == KeyEvent.VK_ENTER) {
			currentState++;
			if(currentState > END_STATE) {
				currentState = MENU_STATE;
			}
		}
		if(keyCode == KeyEvent.VK_UP) {
			rocketship.direction = "up";
		}
		else if(keyCode == KeyEvent.VK_DOWN) {
			rocketship.direction = "down";
		}
		else if(keyCode == KeyEvent.VK_LEFT) {
			rocketship.direction = "left";
		}
		else if(keyCode == KeyEvent.VK_RIGHT) {
			rocketship.direction = "right";
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {

		rocketship.direction = "still";
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
}
