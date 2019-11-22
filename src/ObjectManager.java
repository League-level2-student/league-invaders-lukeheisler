import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

	Rocketship rocketship;
	ArrayList<Projectile> projectileList = new ArrayList<Projectile>();
	ArrayList<Alien> alienList = new ArrayList<Alien>();
	long enemyTimer = 0;
	int enemySpawnTime = 2500;
	int score = 0;
	
	ObjectManager(Rocketship r) {
		
		rocketship = r;
		
	}
	
	void update() {
		
		rocketship.update();
		for (int i = 0; i < projectileList.size(); i++) {
			projectileList.get(i).update();
		}
		for (int i = 0; i < alienList.size(); i++) {
			alienList.get(i).update();
		}
		
	}
	
	void draw(Graphics g) {
		
		rocketship.draw(g);
		for (int i = 0; i < projectileList.size(); i++) {
			projectileList.get(i).draw(g);
		}
		for (int i = 0; i < alienList.size(); i++) {
			alienList.get(i).draw(g);
		}
		
	}
	
	void addProjectile(Projectile p) {
		
		projectileList.add(p);
		
	}
	
	void addAlien(Alien a) {
		
		alienList.add(a);
		
	}
	

	void manageEnemies() {
		
		  if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			  addAlien(new Alien(new Random().nextInt(LeagueInvaders.w), 0, 50, 50));
			  enemyTimer = System.currentTimeMillis();
		  }
		
	}
	
	void purgeObjects() {
		
		for(int i = alienList.size() - 1; i >= 0; i--) {
			
			if(!(alienList.get(i).isAlive)) {
				
				alienList.remove(i);
				
			}
			
		}
		
	}
	
	void checkCollisions() {
		
		for(Alien a : alienList) {
			if(rocketship.collisionBox.intersects(a.collisionBox)) {
				rocketship.isAlive = false;
			}
		}
		
		for(Projectile p : projectileList) {
			for(Alien a : alienList) {
				if(p.collisionBox.intersects(a.collisionBox)) {
					a.isAlive = false;
					p.isAlive = false;
					score++;
				}
			}
		}
	}
	
	int getScore() {
		
		return score;
		
	}
}
