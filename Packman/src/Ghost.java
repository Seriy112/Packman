import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Ghost {
	private int xPosition;
	private int yPosition;
	private int width = 15;
	private int height = 15;
	private Draw draw;
	private int x = 1;
	private int y = 1;
	private int x1 = 1;
	private int y1 = 1;
	public Ghost() {
	

	}

	public void pic(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(xPosition, yPosition, width, height);
	}

	public void move() {
		ActionListener taskPerformer = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (draw.mass[x + x1][y + y1] != 1) {

					x = x + x1;
					y = y + y1;
					 
				}
			}
		};
		new Timer(150, taskPerformer).start();
	}

	void link(Draw mass) {

		draw = mass;
	}

}
