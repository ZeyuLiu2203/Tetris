package UserInterface;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Control.GameControl;
import Control.PlayerControl;



public class Panel extends JPanel{
	
	private Layer[] layouts = null;
	
//	private Layout globalRank = new Layout(40,32,334, 279);
//	private Layout localRank = new Layout(40,343,334, 279);
//	private Layout mainGame = new Layout(414,32,334, 590);
//	
	public Panel(){
		layouts = new Layer[]{
				new Layer(40,32,334, 279),
				new Layer(40,343,334, 279),
				new Layer(414,32,334, 590),
				new Layer(788,32,334, 124),
				new Layer(788,188,176, 148),
				new Layer(964,188,158, 148),
				new Layer(788,368,334, 200),
		};	
		initComponent();
	}
	
	
	public void initComponent(){
		GameControl ctrl = new GameControl(this);
		this.addKeyListener(new PlayerControl(ctrl));
		
		
		
		
		
	}
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Image img = new ImageIcon("Graphics/Background/background.jpg").getImage();
		g.drawImage(img, 0, 0, null);
		for(Layer l: layouts){
			l.createWindow(g);
		}
		//focus on panel
		this.requestFocus();
	}
}
