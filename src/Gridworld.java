import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		world.show();

		Flower flower = new Flower();

		Bug bug = new Bug();
		Location l1 = new Location(2, 2);
		Location l2 = new Location(4, 4);

		Color color = new Color(0, 0, 255);
		bug.setColor(color);
		bug.turn();
		bug.turn();

		for (int i = 0; i < 10; i++) {
			for (int u = 0; u < 10; u++) {
				Location l3 = new Location(i, u);
				if (i == 2 && u == 2 || i == 4 && u == 4) {
					world.add(l1, bug);
					world.add(l2, bug);
				} else {
					world.add(l3, flower);
				}

			}
		}

	}

}
