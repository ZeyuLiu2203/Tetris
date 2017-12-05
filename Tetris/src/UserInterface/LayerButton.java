package UserInterface;

import java.awt.Graphics;

public class LayerButton extends Layer {

	public LayerButton(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		this.createWindow(g);

	}

}
