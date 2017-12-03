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

}
