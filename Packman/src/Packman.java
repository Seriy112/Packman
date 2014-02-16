import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;


public class Packman extends KeyAdapter  {
	
	public int xPosition;
	public int yPosition;
	private int width=15;
	private int height=15;
	private boolean pic;
	private int turn=30;
	private int mouthOpen=300;
	private int mouthClose=360;
	private int x=29;
	private int y=1;
	private int x1=1;
	private int y1=1;
	private Draw draw;

	

	

	public Packman(int xPosition, int yPosition){
		this.xPosition = xPosition;
		this.yPosition = yPosition;

	}	
	
	public void pic(Graphics g){
		g.setColor(Color.YELLOW);
		
		if(pic==true)
			g.fillArc(xPosition, yPosition, width, height,turn,mouthOpen);
		else
		if(pic==false)
			g.fillArc(xPosition, yPosition, width, height,turn,mouthClose);
		
		
		 
	}
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT: 
		x1=0;y1=1;
		//	{y++;}
		turn =30;
		 move();
		

			break;
		case KeyEvent.VK_LEFT: 
			//y--
			x1=0;y1=-1;
		    turn =210;
		    move(); 
	
			break;
		case KeyEvent.VK_UP: 
		
			//x--
			    	x1=-1;y1=0;
			    	  turn =120;
						move();
			  		
	
			
			
			break;
		case KeyEvent.VK_DOWN:
			//x++
			x1=1;y1=0;
			turn =300;
			move();
			
			break;
		}
		
		
	}
	
	
	public void move(){
		 ActionListener taskPerformer = new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		    	  if(draw.mass[x+x1][y+y1]!=1){
		  			
		  			x=x+x1;y=y+y1;} 
		    
					pic= !pic ? true:false; 
		  			
		      }
		  };
		  new Timer(200, taskPerformer).start();
	}
	
	public int getX() {
		return x;
	}	
	
	public int getY() {
		return y;
	}	
	void link(Draw mass){
		
		draw=mass;
	}

	
}
