import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {

	int speed = 10;
	
	Projectile(int x, int y, int w, int h) {
		
		super(x, y, w, h);
		
	}

	void update() {
		
		super.update();
		
		y -= speed;
		if(y < 0) {
			isAlive = false;
		}
		
	}
	
	void draw(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
		
	}
	
}
