import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

public class Packman extends KeyAdapter {

	public int xPosition;
	public int yPosition;
	private int width = 15;
	private int height = 15;
	private boolean pic;
	private int turn = 30;
	private int mouthOpen = 300;
	private int mouthClose = 360;
	private int x;
	private int y;
	private int x1 = 1;
	private int y1 = 1;
	private Draw draw;

	public Packman() {
	
	}

	public void pic(Graphics g) {
		g.setColor(Color.YELLOW);

		if (pic == true)
			g.fillArc(xPosition, yPosition, width, height, turn, mouthOpen);
		else if (pic == false)
			g.fillArc(xPosition, yPosition, width, height, turn, mouthClose);

	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:
			x1 = 0;
			y1 = 1;

			turn = 30;

			break;
		case KeyEvent.VK_LEFT:

			x1 = 0;
			y1 = -1;
			turn = 210;

			break;
		case KeyEvent.VK_UP:

			x1 = -1;
			y1 = 0;
			turn = 120;

			break;
		case KeyEvent.VK_DOWN:

			x1 = 1;
			y1 = 0;
			turn = 300;

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

				pic = !pic ? true : false;

			}
		};
		new Timer(150, taskPerformer).start();
	}

	public void startPlace(int x,int y) {
		this.x=x;
		this.y=y;
	
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	void link(Draw mass) {

		draw = mass;
	}

}
