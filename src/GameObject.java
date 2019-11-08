import java.awt.Graphics;

public class GameObject {
	
	int x;
	int y;
	int width;
	int height;
	boolean isAlive = true;
	
	GameObject(int x, int y, int w, int h) {
		
		this.x = x;
		this.y = y;
		width = w;
		height = h;
		
	}
	
	void update() {
		
	}
	
	void draw(Graphics g) {
		
	}
	
}
