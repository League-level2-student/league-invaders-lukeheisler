import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {

	Rocketship rocketship;
	ArrayList<Projectile> list = new ArrayList<Projectile>();
	
	ObjectManager(Rocketship r) {
		
		rocketship = r;
		
	}
	
	void update() {
		
		rocketship.update();
		
	}
	
	void draw(Graphics g) {
		
		rocketship.draw(g);
		
	}
	
}
