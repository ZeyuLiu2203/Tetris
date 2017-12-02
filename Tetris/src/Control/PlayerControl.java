package Control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerControl implements KeyListener{
	private GameControl ctrl;
	
	
	
	public PlayerControl(GameControl ctrl) {
		this.ctrl = ctrl;
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		int press = e.getKeyCode();
		System.out.println(press);
	}

	

}
