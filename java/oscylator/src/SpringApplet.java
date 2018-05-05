import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JApplet;


// assume that the drawing area is 200 by 200
public class SpringApplet extends JApplet implements MouseListener, MouseMotionListener, ActionListener
{
	private SimEngine parametrs;
	private SimTask time;
	private Timer timer;
	private Button start;
	private boolean mouse_dragged;
	private static final long serialVersionUID = 1L;
	
	 private TextField field_masa;
	 private TextField field_k;
	 private TextField field_c;
	 private TextField field_g;
	 private TextField field_l;
	
	 private Label label_masa,label_k,label_c,label_g,label_l;
	 
	 private int y;
	 
	public void mousePressed(MouseEvent e) {
		 int x_mouse = e.getX();
         int y_mouse = e.getY();
         
         if( x_mouse > 275 && x_mouse < 325 && y_mouse > 100-y && y_mouse < 125-y)
         {
        	 this.timer.cancel();
             parametrs.reset_simulation();
             this.mouse_dragged = true;
             e.consume();
         }
	}
	
	public void mouseReleased(MouseEvent e) {
		if(this.mouse_dragged) {
			 this.timer = new Timer();
	            this.parametrs = new SimEngine(1,1,0.1,0,9.81,0,0,0);
	            this.time = new SimTask(parametrs, this, 0.05);
	            this.timer.scheduleAtFixedRate(time, 100, 10);
	            this.mouse_dragged = false;
	            e.consume();
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		if(this.mouse_dragged){
            int y_mouse = e.getY();
            parametrs.set_x(y_mouse);
            repaint();
        }
        e.consume();
	}
	
	public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    
    public void actionPerformed(ActionEvent e){
        if( e.getSource() == start ){
            timer.cancel();
            parametrs.reset_simulation();
            this.timer = new Timer();
            this.parametrs = new SimEngine(Double.parseDouble(field_masa.getText()), Double.parseDouble(field_k.getText()), Double.parseDouble(field_c.getText()), Double.parseDouble(field_l.getText()), Double.parseDouble(field_g.getText()),this.parametrs.get_x(), this.parametrs.get_v(), this.parametrs.get_x_pktzaw());
            this.time = new SimTask(parametrs, this, 0.05);
            this.timer.scheduleAtFixedRate(time, 100, 10);
            repaint();
        }
    }
    
	public void init() {
	     this.parametrs = new SimEngine(1,1,0.1,0,9.81,0,0,0);
	     double interval = 0.05;				//odstep czasowy
	     this.time = new SimTask( parametrs, this, interval );
	     this.timer = new Timer();
	     mouse_dragged = false;
	     
	     long delay = 100;
	     long period = 10;
	     timer.scheduleAtFixedRate(time,delay,period);
	     
	     addMouseListener(this);
	     addMouseMotionListener(this);
	     
	     setLayout(null);
	        label_masa = new Label("Masa: ");
	        label_k = new Label("Wsp. sprężystości:");
	        label_c = new Label("Wsp. tłumienia:");
	        label_g = new Label("Stała grawitacji:");
	        label_l = new Label("Dł. swobodna sprężyny:");
	        label_masa.setBounds(0,80,35,20);
	        label_k.setBounds(0,100,115,20);
	        label_c.setBounds(0,120,100,20);
	        label_g.setBounds(0,140,100,20);
	        label_l.setBounds(0,160,145,20);
	     
	     field_masa = new TextField();
	     field_k = new TextField();
	     field_c = new TextField();
	     field_g = new TextField();
	     field_l = new TextField();
	     field_masa.setBounds(35,80,30,20);
	     field_k.setBounds(115,100,30,20);
	     field_c.setBounds(100,120,30,20);
	     field_g.setBounds(100,140,30,20);
	     field_l.setBounds(145,160,30,20);
	     
	     start = new Button("START");
	     start.setBounds(0,180,100,20);
	     
	     add(label_masa);
	        add(label_k);
	        add(label_c);
	        add(label_g);
	        add(label_l);
	        add(field_masa);
	        add(field_k);
	        add(field_c);
	        add(field_g);
	        add(field_l);
	        add(start);
	     
	     start.addActionListener(this);
	     
	   }

	   public void paint( Graphics g ) {
		   this.y = (int) parametrs.get_x();
		   setSize(400, 200);
		   g.setColor(Color.white);   
		   g.fillRect(0, 0, 400, 200);
		   g.setColor(Color.blue);
		   g.drawLine(300, 200, 300, 150 - y );
		   g.drawOval(275, 125 - y, 50, 25);
		   //g.fillOval(75,125 - y,50,25);
	   }
}
