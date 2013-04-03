package unit;

import world.World;
import android.graphics.Bitmap;
import com.example.towerdefence.Game;

public class NormalTower extends Tower {

	public NormalTower(Game game, World controller, int x, int y) {
		super(game, controller, x, y);
		attackspeed = 0.5f;
		images = new Bitmap[3];
		images[0] = game.loadBitmap("towers/normalTower.png");
		images[1] = game.loadBitmap("towers/normalTowerLevel2.png");
		images[2] = game.loadBitmap("towers/normalTowerLevel3.png");
		currentImage = images[0];
		projectileImage = game.loadBitmap("towers/normalTowerProjectile.png");
		damage = 1;
		price = 5;
		range = 5;
		maxLevel = 3;
	}

}