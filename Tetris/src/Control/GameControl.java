package Control;

import Service.GameService;
import UserInterface.Panel;

public class GameControl {
	private Panel panel;
	private GameService gameService;
	public GameControl(Panel panel, GameService gameService) {
		this.panel = panel;
		this.gameService = gameService;
	}
	public void move(int moveX, int moveY) {
		this.gameService.move(moveX, moveY);
		this.panel.repaint();
	}
	public void rotate(){
		this.gameService.rotate();
		this.panel.repaint();
	}
	public void keyDown(int i, int j) {
		this.gameService.keyDown(i, j);
		this.panel.repaint();
		
	}

}
