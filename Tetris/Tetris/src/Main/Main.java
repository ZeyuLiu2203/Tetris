package Main;

import Control.GameControl;
import Control.PlayerControl;
import DTO.GameDTO;
import Service.GameService;
import UserInterface.FrameGame;
import UserInterface.Panel;

public class Main {

	public static void main(String[] args) {
		
		GameDTO gameDTO = new GameDTO();
		Panel panel = new Panel(gameDTO);
		GameService gameService = new GameService(gameDTO);
		GameControl gameControl = new GameControl(panel, gameService);
		PlayerControl playerControl = new PlayerControl(gameControl);
		panel.setPlayerControl(playerControl);
		FrameGame f = new FrameGame(panel);
	}

}
