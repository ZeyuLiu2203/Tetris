package Entity;

import java.awt.Point;

public class GameAct {
	private Point[] gameAct;
	
	
	private static int MIN_X = 0;
	private static int MAX_X = 9;
	private static int MIN_Y = 0;
	private static int MAX_Y = 17;
	
	public GameAct(){
		init(0);
	}
	
	public void init(int actCode){
		gameAct = new Point[]{
				new Point(4,0),
				new Point(3,0),
				new Point(5,0),
				new Point(5,1),
		};
	}

	public Point[] getPoints() {
		return gameAct;
	}
	public boolean move(int moveX, int moveY, boolean[][] gameMap){
		
		for(Point p: gameAct){
			int newX = p.x+moveX;
			int newY = p.y+moveY;
			if(isOverlap(newX, newY, gameMap)){
				return false;
			}
		}
		for(Point p: gameAct){
			p.x+=moveX;
			p.y+=moveY;
		}
		return true;
	}
	
	public void rotate(boolean[][] gameMap){
		for(int i = 1; i< gameAct.length;i++){
			int newX = gameAct[0].x + gameAct[0].y - gameAct[i].y;
			int newY = gameAct[0].y - gameAct[0].x + gameAct[i].x;
			if(isOverlap(newX, newY,gameMap)){
				return;
			}
		}
			
		for(int t = 1; t< gameAct.length;t++){
			int newX = gameAct[0].x + gameAct[0].y - gameAct[t].y;
			int newY = gameAct[0].y - gameAct[0].x + gameAct[t].x;
			gameAct[t].x = newX;
			gameAct[t].y = newY;
			
		}
	}
	
	
	private boolean isOverlap(int x, int y, boolean[][] gameMap){
		
		return x<MIN_X || x>MAX_X || y< MIN_Y || y> MAX_Y || gameMap[x][y];
		
		
	}
}
