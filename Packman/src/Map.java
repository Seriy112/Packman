import java.awt.Color;
import java.awt.Graphics;


public class Map {
	private static final int n=4;
	private static final int m=4;
	private int xPosition;
	private int yPosition;
	private int width;
	private int height;
	private Map map;

	Map(int xPosition, int yPosition, int width, int height){
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.width = width;
		this.height = height;
System.out.println("Nikita LOX");
	}
	
	public void draw(Graphics g) {
		 int mass[][]={{0,0,0},
					{0,1,0},
					{0,0,0}};
			 for(int i=0; i<3;i++){
					for(int j=0;j<3;j++){
						if(mass[i][j]==0)
						{
					g.setColor(Color.GREEN);
					g.fillRect(xPosition, yPosition, width, height);
					}
						xPosition += width+5;
					}
						yPosition += height+5;
						xPosition = 0;
					}
			 xPosition=0;
			 yPosition=0;
			}
	
		
		
		

	public void map(){

	
		
	}
	
}
	
