package UserInterface;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerGlobalRank extends Layer{
	
	//private static Image GLOBAL_RANK = new ImageIcon("Graphics/Window/globalRank.png").getImage();

	public LayerGlobalRank(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void paint(Graphics g) {
		this.createWindow(g);
		g.setFont(new Font("roman",Font.BOLD,30));
		//g.drawImage(GLOBAL_RANK, 60, 60, null);
		//String temp = Integer.toString(this.gameDTO.getPoint());
		
		g.drawString("Global Rank", 60, 75);
	}

}
