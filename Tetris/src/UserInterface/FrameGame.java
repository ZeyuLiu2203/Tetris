package UserInterface;

import javax.swing.JFrame;

public class FrameGame extends JFrame{
		
	public FrameGame(Panel panel){
		this.setTitle("Zeyu's Tetris");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1168, 680);
		this.setResizable(false);
		this.setLocation(200, 200);
		this.setContentPane(panel);
		this.setVisible(true);
	}
	
}