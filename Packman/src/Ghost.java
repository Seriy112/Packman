import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

public class Ghost {
	public int xPosition;
	public int yPosition;
	private int width = 15;
	private int height = 15;
	private int x = 1;
	private int y = 1;
	private int x1 = 1;
	private int y1 = 1;
	private int direction=1;
	private Draw draw;
	public Ghost() {
	

	}

	public void pic(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(xPosition, yPosition, width, height);
	}

	public void logic(){
		switch (direction) {
		case 1:
			x1 = 0;
			y1 = 1;

			

			break;
		case 2:

			x1 = 0;
			y1 = -1;
			

			break;
		case 3:

			x1 = -1;
			y1 = 0;
		
			break;
		case 4:

			x1 = 1;
			y1 = 0;
			

			break;
		}
	}	
	
	public void move() {
		ActionListener taskPerformer = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (draw.mass[x + x1][y + y1] != 1) {

					x = x + x1;
					y = y + y1;
					 
				}
				else
				{
					direction=(int)(1 + Math.random() * 4);
				}
			}
		};
		new Timer(150, taskPerformer).start();
	}
	
	public void startPlaceGhost(int x,int y) {
		this.x=x;
		this.y=y;
	
	}

	void link(Draw mass) {

		draw = mass;
	}

}
