import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	
	int x;
	int y;
	int width;
	int height;
	boolean isAlive = true;
	Rectangle collisionBox;
	
	GameObject(int x, int y, int w, int h) {
		
		this.x = x;
		this.y = y;
		width = w;
		height = h;
		collisionBox = new Rectangle(this.x, this.y, width, height);
		
	}
	
	void update() {
		
		collisionBox.setBounds(x, y, width, height);
		
	}
	
	void draw(Graphics g) {
		
	}
	
}
