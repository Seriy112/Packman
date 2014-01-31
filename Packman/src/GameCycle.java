import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameCycle extends JFrame {
	private JPanel panel;

	public static void main(String[] args) {
		GameCycle game = new GameCycle();
		game.setVisible(true);

	}

	private GameCycle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 500);
		panel = new JPanel() {
			public void paint(Graphics g) {
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 640, 500);
				g.setColor(Color.BLUE);
System.out.println("fdfg");
			}
		};
		panel.setSize(500, 500);
		add(panel);

	}

	private void prepare() {

	}

}
