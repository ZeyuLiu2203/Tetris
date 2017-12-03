package UserInterface;

import java.awt.Font;
import java.awt.Graphics;

public class LayerGlobalRank extends Layer{

	public LayerGlobalRank(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void paint(Graphics g) {
		this.createWindow(g);
		g.setFont(new Font("roman",Font.BOLD,64));
		String temp = Integer.toString(this.gameDTO.getPoint());
		
		g.drawString(temp, 80, 80);
	}

}
