package Control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerControl implements KeyListener{
	private GameControl gameControl;
	
	
	
	public PlayerControl(GameControl gameControl) {
		this.gameControl = gameControl;
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		int temp = e.getKeyCode();
		if(temp == 37){
			gameControl.move(-1,0);
		}
		else if(temp == 39){
			gameControl.move(1,0);
		}
		else if(temp == 40){
			gameControl.keyDown(0,1);
		}
		else if(temp == 38){
			gameControl.rotate();
		}
	}

	

}
