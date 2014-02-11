import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Packman extends KeyAdapter  {
	
	public int xPositionPack;
	public int yPositionPack;
	public int widthPack=15;
	public int heightPack=15;
	private static final int n=31;
	private static final int m=32;
	private GameCycle game;
	private Draw draw;
	private int width=15;
	private int height=15;
	public int x=15;
	public int y=15;
	

	

	public Packman(int xPosition, int yPosition){
		this.xPositionPack = xPosition+30;
		this.yPositionPack = yPosition+30;
	//	draw=new Draw(0, 0, width, height);
	}	
	
	public void drawpackman(Graphics g){
		g.setColor(Color.YELLOW);
		g.fillOval(xPositionPack, yPositionPack, widthPack, heightPack);
		
		
		 
	}
	public void keyPressed(KeyEvent e) {
		draw =new Draw(0,0,width,height);
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:	
			
			this.xPositionPack +=17;
	  
			
		 	
		break;
		case KeyEvent.VK_LEFT:
			this.xPositionPack -=17;
		
		    break;
		case KeyEvent.VK_UP:
			this.yPositionPack -=17;
			
			break;
		case KeyEvent.VK_DOWN:
			this.yPositionPack +=17;
			

			break;
		}
		
		
	}
	
	//28 2

		
	
	
	
}
