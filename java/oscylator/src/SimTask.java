import java.util.*;

public class SimTask extends TimerTask{
	@Override
	public void run() {
		parametrs.simulation( interval );
		screen.repaint();
	}
	
	private SimEngine parametrs;
	private SpringApplet screen;
	private double interval;
	
	public SimTask( SimEngine parametrs, SpringApplet screen, double interval) {
		this.parametrs = parametrs;
		this.screen = screen;
		this.interval = interval;
	}
	
}
