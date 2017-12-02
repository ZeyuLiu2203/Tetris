package UserInterface;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Layer {
	// distance from top left corner to panel
	private int x;
	private int y;
	//size of panel
	private int width;
	private int height;
	private final int SIZE = 7;
	private final Image img = new ImageIcon("Graphics/Window/window.PNG").getImage();
	private final int imgW = img.getWidth(null);
	private final int imgH = img.getHeight(null);
	
	public Layer(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void createWindow(Graphics g){
		g.drawImage(img, x, y, x+SIZE, y+ SIZE, 0,0, SIZE,SIZE, null);
		g.drawImage(img, x+SIZE, y, x+width-SIZE, y+ SIZE, SIZE,0, imgW - SIZE,SIZE, null);
		g.drawImage(img, x+width-SIZE, y, x+width, y+ SIZE, imgW - SIZE,0, imgW,SIZE, null);
		g.drawImage(img, x, y+SIZE, x+SIZE, y+height- SIZE, 0,SIZE, SIZE,imgH - SIZE, null);
		g.drawImage(img, x+SIZE, y+SIZE, x+width - SIZE, y+height- SIZE, SIZE,SIZE, imgW  - SIZE,imgH - SIZE, null);
		g.drawImage(img, x+width - SIZE, y+SIZE, x+width, y+height- SIZE, imgW-SIZE,SIZE, imgW,imgH - SIZE, null);
		g.drawImage(img, x, y+height -SIZE, x+SIZE, y+height, 0,imgH-SIZE, SIZE,imgH, null);
		g.drawImage(img, x+SIZE, y+height - SIZE, x+width - SIZE, y+height, SIZE,imgH - SIZE, imgW  - SIZE,imgH, null);
		g.drawImage(img, x+width - SIZE, y+height - SIZE, x+width , y+height, imgW - SIZE,imgH - SIZE, imgW,imgH , null);
	}
		
		
		
		
		
		
		
		
		
		
		
}
