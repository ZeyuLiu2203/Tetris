package Service;

import java.awt.Point;

import DTO.GameDTO;
import Entity.GameAct;

public class GameService {
	
	private GameDTO gameDTO;
	public GameService(GameDTO gameDTO){
		this.gameDTO = gameDTO;
		GameAct gameAct = new GameAct();
		this.gameDTO.setGameAct(gameAct);
	}
	public void move(int moveX, int moveY) {
		if(isBoundary(moveX, moveY)){
			gameDTO.getGameAct().move(moveX, moveY);
		}
	}
	
	private boolean isBoundary(int moveX, int moveY){
		Point[] points = gameDTO.getGameAct().getPoints();
		for(Point p: points){
			if(p.x+moveX < 0 || p.x+moveX > 9 || p.y+moveY < 0 || p.y+moveY > 17){
				return false;
			}
			
		}
		
		
		
		
		return true;
	}
}
