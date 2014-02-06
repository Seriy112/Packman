import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Packman extends KeyAdapter  {

	private int xPosition;
	private int yPosition;
	private int width;
	private int height;
	private boolean pic=false;
	private int turn=30;
	private int mouthOpen=300;
	private int mouthClose=360;
	public Packman(int xPosition, int yPosition, int width, int height){
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.width = width;
		this.height = height;
		
	}
	
	
	public void draw1(Graphics g) {
		
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
			
			break;
		case KeyEvent.VK_LEFT:
			
			turn =210;
			pic= !pic ? true:false; 
		
			break;
		case KeyEvent.VK_UP:
			
			turn =120;
			pic= !pic ? true:false; 
			break;
		case KeyEvent.VK_DOWN:
			turn =300;
			pic= !pic ? true:false; 
			break;
		}
	}

	
	
}
