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
		
			gameDTO.getGameAct().move(moveX, moveY,gameDTO.getGameMap());
	}
	
//	private boolean isBoundary(int moveX, int moveY){
//		Point[] points = gameDTO.getGameAct().getPoints();
//		for(Point p: points){
//			if(p.x+moveX < 0 || p.x+moveX > 9 || p.y+moveY < 0 || p.y+moveY > 17){
//				return false;
//			}
//			
//		}
//		return true;
//	}
	public void rotate() {
		this.gameDTO.getGameAct().rotate(gameDTO.getGameMap());
		
	}
	public void keyDown(int i, int j) {
		if(this.gameDTO.getGameAct().move(i, j,gameDTO.getGameMap())){
			return;
			}
		boolean[][] map = gameDTO.getGameMap();
		for(Point p: gameDTO.getGameAct().getPoints()){
			map[p.x][p.y] = true;
			//todo list
			//boolean get point?
			//get point
			//boolean levelup?
			//new Act
			
		}
		this.gameDTO.getGameAct().init(0);
	}
}
