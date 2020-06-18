package eap.ads;

import java.awt.*;
import javax.swing.*;


public class SidePanel extends JPanel {

	private static final long serialVersionUID = -40557434900946408L;

	private static final Font LARGE_FONT = new Font("Tahoma", Font.BOLD, 20);

	private static final Font MEDIUM_FONT = new Font("Tahoma", Font.BOLD, 16);

	private static final Font SMALL_FONT = new Font("Tahoma", Font.BOLD, 12);

	private SnakeGame game;

	public SidePanel(SnakeGame game) {
		this.game = game;

		setPreferredSize(new Dimension(300, BoardPanel.ROW_COUNT * BoardPanel.TILE_SIZE));
		setBackground(Color.BLACK);
	}
	
	private static final int STATISTICS_OFFSET = 180;

	private static final int LGPD_OFFSET = 50;
	
	private static final int CONTROLS_OFFSET = 320;
	
	private static final int MESSAGE_STRIDE = 30;
	
	private static final int SMALL_OFFSET = 30;
	
	private static final int LARGE_OFFSET = 50;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.WHITE);

		g.setFont(LARGE_FONT);
		g.drawString("SnakePD", getWidth() / 2 - g.getFontMetrics().stringWidth("Snake Game") / 2, 50);

		g.setFont(MEDIUM_FONT);
		g.drawString("", SMALL_OFFSET, LGPD_OFFSET);
		g.drawString("Estatística", SMALL_OFFSET, STATISTICS_OFFSET);
		g.drawString("Controles", SMALL_OFFSET, CONTROLS_OFFSET);

		g.setFont(SMALL_FONT);

		int drawY = LGPD_OFFSET;
		g.drawString("Texto: TAB", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Enviar texto: CTRL + T", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Encontrar texto: CTRL + G", LARGE_OFFSET, drawY += MESSAGE_STRIDE);

		drawY = STATISTICS_OFFSET;
		g.drawString("Pontuação total: " + game.getScore(), LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Frutas comidas: " + game.getFruitsEaten(), LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Pontuação das frutas: " + game.getNextFruitScore(), LARGE_OFFSET, drawY += MESSAGE_STRIDE);

		drawY = CONTROLS_OFFSET;
		g.drawString("Mover p/ Cima: W / ↑", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Mover p/ Baixo: S / ↓", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Mover p/ Esquerda: A / ←", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Mover p/ Direita: D / →", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Pausar: P", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
	}

}
