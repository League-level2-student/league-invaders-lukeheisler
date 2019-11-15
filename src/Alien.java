import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {

	Alien(int x, int y, int w, int h) {
		
		super(x, y, w, h);
		
	}
	
	void update() {
		
		y++;
		
	}
	
	void draw(Graphics g) {
		
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
		
	}

}
