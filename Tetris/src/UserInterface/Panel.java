package UserInterface;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Control.GameControl;
import Control.PlayerControl;
import DTO.GameDTO;
import Service.GameService;



public class Panel extends JPanel{
	
	private Layer[] layouts = null;
	private GameDTO gameDTO;
	
//	private Layout globalRank = new Layout(40,32,334, 279);
//	private Layout localRank = new Layout(40,343,334, 279);
//	private Layout mainGame = new Layout(414,32,334, 590);
//	
	public Panel(GameDTO gameDTO){
		this.gameDTO = gameDTO;
		layouts = new Layer[]{
				//global rank
				new LayerGlobalRank(40,32,334, 279),
				//local rank
				new LayerLocalRank(40,343,334, 279),
//				//Main game
				new LayerMainGame(414,32,334, 590),
				//button
				new LayerButton(788,32,334, 124),
				//next object
				new LayerNextOne(788,188,176, 148),
				//level
				new LayerLevel(964,188,158, 148),
				//points & #of lines removed
				new LayerPoints(788,368,334, 200),
		};	
		for(Layer l: layouts){
			l.setGameDTO(gameDTO);
		}
		initComponent();
	}
	
	public void setPlayerControl(PlayerControl playerControl){
		this.addKeyListener(playerControl);
	}
	
	
	public void initComponent(){
	
		
		
		
		
	}
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Image img = new ImageIcon("Graphics/Background/background.jpg").getImage();
		g.drawImage(img, 0, 0, null);
		for(Layer l: layouts){
			l.paint(g);
		}
		//focus on panel
		this.requestFocus();
	}
}
