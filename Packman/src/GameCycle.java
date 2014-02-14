import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class GameCycle extends JFrame {
	private JPanel panel,Win;
    private int xPosition=20;
	private int yPosition=410;
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
		 ActionListener taskPerformer = new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		    	  GameCycle.this.repaint();
		      }
		  };
		  new Timer(30, taskPerformer).start();
		
	}
	
	private void prepare() {
		
				
		draw =new Draw(xPosition,yPosition,width,height);
		packman=new Packman(xPosition,yPosition);
		draw.link(packman);
		packman.link(draw);
		addKeyListener(packman);
		
	}


}
