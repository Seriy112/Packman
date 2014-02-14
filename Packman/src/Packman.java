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
		turn =30;
			pic= !pic ? true:false; 
		y++;
		
	
			
			break;
		case KeyEvent.VK_LEFT: y--;
			
			turn =210;
			pic= !pic ? true:false; 
		
			break;
		case KeyEvent.VK_UP: x--;
			turn =120;
			pic= !pic ? true:false; 
			
			break;
		case KeyEvent.VK_DOWN:
			 x++;
		
			turn =300;
			pic= !pic ? true:false; 
			
			break;
		}
		
		
	}
	
	public int getX() {
		return x;
	}	
	
	public int getY() {
		return y;
	}	
		
	
	
	
}
