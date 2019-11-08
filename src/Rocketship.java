import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	
	int speed = 5;
	String direction = "still";
	
	Rocketship(int x, int y, int w, int h) {
		
		super(x, y, w, h);
		
	}
	
	void update() {
		
		if(direction == "up") {
			y += speed * -1;
		}
		else if(direction == "down") {
			y += speed * 1;
		}
		else if(direction == "left") {
			x += speed * -1;
		}
		else if(direction == "right") {
			x += speed * 1;
		}
		
	}
	
	void draw(Graphics g) {
		
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
		
	}

}
