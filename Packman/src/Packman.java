import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Packman extends KeyAdapter  {

	private int xPosition;
	private int yPosition;
	private int width;
	private int height;
	private int pic=0;
	public Packman(int xPosition, int yPosition, int width, int height){
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.width = width;
		this.height = height;
		
	}
	
	
	public void draw1(Graphics g) {
		
		g.setColor(Color.YELLOW);
		
		if(pic==0)
			g.fillArc(xPosition, yPosition, width, height,30,300);
		else
		if(pic==1)
			g.fillArc(xPosition, yPosition, width, height,30,360);
	}
	
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:
		
		

			if(pic==0){pic=1;}else{pic=0;}
			break;
		case KeyEvent.VK_LEFT:
			
			
			if(pic==0){pic=1;}else{pic=0;}
			break;
		}
	}

	
	
}
