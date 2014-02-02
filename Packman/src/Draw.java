import java.awt.Color;
import java.awt.Graphics;


public class Draw {
	private static final int n=4;
	private static final int m=4;
	private int xPosition;
	private int yPosition;
	private int width;
	private int height;

	private Packman packman;
	
	public Draw(int xPosition, int yPosition, int width, int height){
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.width = width;
		this.height = height;

	}
	
	public void draw(Graphics g) {
		  int mass[][]={{1,1,1,1,1,1,1,1,1},
				  		{1,0,0,0,2,0,0,0,1},
				  		{1,0,1,1,0,0,0,0,1},
				  		{1,0,0,1,0,0,0,0,1},
				  		{1,0,0,0,7,0,0,0,1},
				  		{1,1,1,1,1,1,1,1,1},
				                };
		 
			 for(int i=0; i<6;i++){
					for(int j=0;j<9;j++){
						if(mass[i][j]==1)
						{
							g.setColor(Color.GREEN);
							g.fillRect(xPosition, yPosition, width, height);
						}
						else
							if(mass[i][j]==7)
						{		
							//	packman.draw1(g);
							
						}
						else
							if(mass[i][j]==2)
						{
								g.setColor(Color.BLUE);
								g.fillArc(xPosition, yPosition, width, height,40,300);
						}
						xPosition += width;
					}
						yPosition += height;
						xPosition = 0;
					}
			 xPosition=0;
			 yPosition=0;
			}
	
		
		
	
}
	
