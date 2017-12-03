package UserInterface;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

import UserInterface.Layer;

public class LayerMainGame extends Layer {
	
	private static Image ACT = new ImageIcon("Graphics/Rect/rect.png").getImage();
	private static int ACT_SIZE = 32;

	public LayerMainGame(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		this.createWindow(g);
		Point[] points = this.gameDTO.getGameAct().getPoints();
		for(Point p: points){
			System.out.println(p);
			g.drawImage(ACT, this.x+ p.x*ACT_SIZE+7,
					this.y+p.y*ACT_SIZE+7,
					this.x+ p.x*ACT_SIZE+ACT_SIZE+7, 
					this.y+p.y*ACT_SIZE+ACT_SIZE+7, 
					0, 0, 32, 32,null);
		}
		
	}

}
