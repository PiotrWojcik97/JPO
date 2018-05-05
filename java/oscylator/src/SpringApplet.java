import java.awt.*;
import java.util.*;
import javax.swing.JApplet;


// assume that the drawing area is 200 by 200
public class SpringApplet extends JApplet
{
	private SimEngine parametrs;
	private SimTask time;
	private Timer timer;
	
	private static final long serialVersionUID = 1L;
	public void init() {
	     this.parametrs = new SimEngine(1,1,0.1,0,0,0,0);
	     double interval = 0.05;				//odstep czasowy
	     this.time = new SimTask( parametrs, this, interval );
	     this.timer = new Timer();
	     
	     long delay = 100;
	     long period = 10;
	     timer.scheduleAtFixedRate(time,delay,period);
	     
	   }

	   public void paint( Graphics g ) {
		   int y = (int) parametrs.get_x();
		   setSize(200, 200);
		   g.setColor(Color.white);   
		   g.fillRect(0, 0, 200, 200);
		   g.setColor(Color.blue);
		   g.drawLine(100, 200, 100, 150 - y );
		   g.drawOval(75, 125 - y, 50, 25);
		   //g.fillOval(75,125 - y,50,25);
	   }
}
