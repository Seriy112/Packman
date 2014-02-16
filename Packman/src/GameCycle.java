import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class GameCycle extends JFrame {
	private JPanel panel,Win;
    private int xPosition=0;
	private int yPosition=0;
	private int width=15;
	private int height=15;         
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
		setSize(560, 500);
		panel = new JPanel() {
			public void paint(Graphics g) {
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 560, 500);
			
		
				draw.draw(g);
				
				if(draw.WinLoss==false) {

					
					
					g.drawString("YOU WIN )))", 200, 200);
				
					
				}
		
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
		packman=new Packman(xPosition,yPosition);
		draw.link(packman);
		packman.link(draw);
		addKeyListener(packman);
		packman.move();
	}


}
