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
	private boolean pic;
	private int turn=30;
	private int mouthOpen=300;
	private int mouthClose=360;
	

	

	public Packman(int xPosition, int yPosition){
		this.xPositionPack = xPosition+30;
		this.yPositionPack = yPosition+30;

	}	
	
	public void pic(Graphics g){
		g.setColor(Color.YELLOW);
		
		if(pic==true)
			g.fillArc(xPositionPack, yPositionPack, width, height,turn,mouthOpen);
		else
		if(pic==false)
			g.fillArc(xPositionPack, yPositionPack, width, height,turn,mouthClose);
		
		
		 
	}
	public void keyPressed(KeyEvent e) {
		draw =new Draw(0,0,width,height);
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:	
			turn =30;
			pic= !pic ? true:false; 
			this.xPositionPack +=17;
			
			
			break;
		case KeyEvent.VK_LEFT:
			this.xPositionPack -=17;
			turn =210;
			pic= !pic ? true:false; 
		
			break;
		case KeyEvent.VK_UP:
			this.yPositionPack -=17;
			turn =120;
			pic= !pic ? true:false; 
			break;
		case KeyEvent.VK_DOWN:
			this.yPositionPack +=17;
			turn =300;
			pic= !pic ? true:false; 
			break;
		}
		
		
	}
	
	//28 2

		
	
	
	
}
