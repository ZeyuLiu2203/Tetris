package DTO;

import java.util.List;

import Entity.GameAct;

public class GameDTO {
	
	//global rank
	private List<Player> dataBaseRecord;
	// local rank
	private List<Player> localDataRecord;
	//stack on the bottom
	private boolean[][] gameMap;
	//tetris
	private GameAct gameAct;
	//next tetris
	private int next;
	//current point
	private int point;
	//# of lines removed
	private int removedLine;
	public GameDTO(){
		dtoInit();
	}
	public void dtoInit(){
		this.gameMap = new boolean[10][18];
	}
	
	
	public List<Player> getDataBaseRecord() {
		return dataBaseRecord;
	}
	public void setDataBaseRecord(List<Player> dataBaseRecord) {
		this.dataBaseRecord = dataBaseRecord;
	}
	public List<Player> getLocalDataRecord() {
		return localDataRecord;
	}
	public void setLocalDataRecord(List<Player> localDataRecord) {
		this.localDataRecord = localDataRecord;
	}
	public boolean[][] getGameMap() {
		return gameMap;
	}
	public void setGameMap(boolean[][] gameMap) {
		this.gameMap = gameMap;
	}
	public GameAct getGameAct() {
		return gameAct;
	}
	public void setGameAct(GameAct gameAct) {
		this.gameAct = gameAct;
	}
	public int getNext() {
		return next;
	}
	public void setNext(int next) {
		this.next = next;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getRemovedLine() {
		return removedLine;
	}
	public void setRemovedLine(int removedLine) {
		this.removedLine = removedLine;
	}
	
	
	
}
