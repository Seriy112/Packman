import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


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
			if(draw.mass[x][y+1]!=1)
			{
		turn =30;
			pic= !pic ? true:false; 
		y++;
		
			}
			
			break;
		case KeyEvent.VK_LEFT: 
			if(draw.mass[x][y-1]!=1)
			{ y--;
		    turn =210;
			pic= !pic ? true:false; 
		}
			break;
		case KeyEvent.VK_UP: 
			if(draw.mass[x-1][y]!=1){
			x--;
			turn =120;
			pic= !pic ? true:false; 
			}
			break;
		case KeyEvent.VK_DOWN:
			if(draw.mass[x+1][y]!=1){
			 x++;
		
			turn =300;
			pic= !pic ? true:false; 
			}
			break;
		}
		
		
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
