import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;

import javax.swing.JFrame;






public class Draw extends JFrame {
	private static final int n=31;
	private static final int m=32;
	
	public int xPosition;
	public int yPosition;
	private int width;
	private int height;
	private int widthPoint=3;
	private int heightPoint=3;
	Draw draw;
	Packman packman;
    public boolean WinLoss=true;
	private int eatPoint=0; 
	private int point=0;
	private int i=0;
	private int j=0;
    private int oldI=29;
	private int oldJ=1;
	private boolean startPlase=true;
	private boolean startPlaseGhost=true;
	Collision collision;
	Ghost ghost;
	public int mass[][]={
			 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			 {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1},
			 {1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1},
			 {1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,1},
			 {1,0,0,0,0,0,0,1,1,1,1,0,0,1,0,0,0,1,0,0,1,1,1,1,0,0,0,0,1,0,0,1},
			 {1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1},
			 {1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1},
			 {1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1},
			 {1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1},
			 {1,0,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,1,0,0,1,0,0,1},
			 {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,1,0,0,1},
			 {1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1},
			 {1,0,0,0,0,0,0,0,0,0,1,2,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1},
			 {1,0,0,0,0,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,0,0,0,1,0,0,1},
			 {1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1},
			 {1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1},
			 {1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,0,0,1},
			 {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,1},
			 {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1},
			 {1,0,0,1,1,1,1,1,1,0,0,1,0,0,0,1,1,0,0,0,1,0,0,1,1,1,1,1,1,0,0,1},
			 {1,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,1},
		     {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1},
			 {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,7,1},
			 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	              };

	
	
	
	

	Draw(int xPosition, int yPosition, int width, int height){
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.width = width;
		this.height = height; 
	
		
	}
	
	public void draw(Graphics g) {
		
	
	
		
		
		for( i=0; i<n;i++){
					for(j=0;j<m;j++){
						if(mass[i][j]==0)eatPoint++;
						if(mass[i][j]==1)
							{
							if(i>0 && i!=m-2 && j>0 && j!=n  ){
								g.setColor(Color.BLUE);
								g.fillRect(xPosition, yPosition, width, height);
								} 
								else {
								g.setColor(Color.GREEN);
								g.fillRect(xPosition, yPosition, width, height);	
								}
							}
						if(mass[i][j]==0)
							{	
							g.setColor(Color.yellow);
							g.fillOval(xPosition, yPosition, widthPoint, heightPoint);
							point++;
							}
						if(mass[i][j]==7)
						{
							if(startPlase){packman.startPlace(i, j); startPlase=false;}
							if(oldI!=i || oldJ!=j){
								mass[oldI][oldJ]=3;
								 oldI=i;
								 oldJ=j;
							}
						
							
							packman.xPosition=xPosition;
							packman.yPosition=yPosition;
							
							packman.pic(g);     
						    
					if(mass[packman.getX()][packman.getY()]==0){
						
						eatPoint++; 
						if(eatPoint==point) WinLoss=false;
						
					}
					
						
					
							mass[packman.getX()][packman.getY()]=7;	
							
						
							
						}
						if(mass[i][j]==2)
						{
							if(startPlaseGhost)
							{ghost.startPlaceGhost(i, j); startPlaseGhost=false;}
							ghost.xPosition=xPosition;
							ghost.yPosition=yPosition;
							ghost.pic(g);
							mass[ghost.getX()][ghost.getY()]=2;	
							
						}
                      xPosition += width;
					}
						yPosition += height;
						xPosition = 0;
					}
			 xPosition=0;
			 yPosition=0;
			 if(eatPoint==0)WinLoss=false;
			 eatPoint=0;
			 
			         
			}

void link(Packman nom){
	
	packman=nom;
	
}
	Draw linkmass()
	{
		 
		
		return draw;
		
		
	}
	void linkGhost(Ghost linkghost){
		ghost=linkghost;
		
	}

}
	
