import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameCycle extends JFrame {
	private JPanel panel;
	private int xPosition=0;
	private int yPosition=0;
	private int width=40;
	private int height=40;
	private Draw draw;
	private Packman packman;
	
	public static void main(String[] args) {
		GameCycle game = new GameCycle();
		game.setVisible(true);
		game.prepare();
		game.cycle();
	}

	private GameCycle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		panel = new JPanel() {
			public void paint(Graphics g) {
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 500, 500);
			
				
				draw.draw(g);
				packman.draw1(g);	
			
				}
		};
		panel.setSize(500, 500);
		add(panel);

	}

	private void cycle(){
		while (true) {
			long startTime = System.currentTimeMillis();
	
			GameCycle.this.repaint();

						
			long endTime = System.currentTimeMillis();
			long deltaTime = endTime - startTime;
			if (deltaTime < 10) {
				try {
					TimeUnit.MILLISECONDS.sleep(10 - deltaTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	
	private void prepare() {
		
				
		draw =new Draw(xPosition,yPosition,width,height);
		packman=new Packman(xPosition,yPosition,width,height);
		
		addKeyListener(packman);
		
	}

}
