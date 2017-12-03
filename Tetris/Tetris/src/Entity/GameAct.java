package Entity;

import java.awt.Point;

public class GameAct {
	private Point[] gameAct;
	
	public GameAct(){
		gameAct = new Point[]{
				new Point(3,0),
				new Point(4,0),
				new Point(5,0),
				new Point(5,1),
		};
	}

	public Point[] getPoints() {
		return gameAct;
	}
	public void move(int moveX, int moveY){
		for(Point p: gameAct){
			p.x+=moveX;
			p.y+=moveY;
		}
	}
}
