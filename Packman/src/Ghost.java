import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;


public class Ghost {
	private int xPosition;
	private int yPosition;
	private int width=15;
	private int height=15;

	

	

	public Ghost(int xPosition, int yPosition){
		this.xPosition = xPosition;
		this.yPosition = yPosition;

	}	
	
	public void pic(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(xPosition, yPosition,width, height);

		
		
		   
	}
	
}
