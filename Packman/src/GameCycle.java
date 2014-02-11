import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.ChangedCharSetException;


public class GameCycle extends JFrame {
	private JPanel panel;
    private int xPosition=0;
	private int yPosition=0;
	private int width=15;
	private int height=15;         
	private Draw draw;
	private Packman packman;
	private int xPositionPack=-3;
	private int yPositionPack=387;
	public int x=10;
	public int y=10;
	
	public static void main(String[] args) {
		GameCycle game = new GameCycle();
		game.setVisible(true);
		game.prepare();
		game.cycle();
	}

	private GameCycle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(560, 500);
		panel = new JPanel() {
			public void paint(Graphics g) {
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 560, 500);
			
				packman.pic(g);
				draw.draw(g);
				//int a=packman.getXPosition();
			
			
			
				
			
							
			
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
		packman=new Packman(xPositionPack,yPositionPack);
		addKeyListener(packman);
		
		
	}


}
