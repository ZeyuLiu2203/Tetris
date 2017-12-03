package UserInterface;

import java.awt.Graphics;

public class LayerLocalRank extends Layer{

	public LayerLocalRank(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void paint(Graphics g) {
		this.createWindow(g);
		
	}

}
