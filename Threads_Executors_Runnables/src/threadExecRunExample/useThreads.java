import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

//package threadExecRunExample;

public class useThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new BouceFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}

}

class BallThread implements Runnable {

	public BallThread(Ball oneBall, Component oneComponent) {
		ball = oneBall;
		component = oneComponent;

	}

	public void run() {

		for (int i=1; i<=3000; i =++) {

			ball.move_ball(component.getBounds());

			component.paint(component.getGraphics());

			try {
				Thread.sleep(4);
			}
			catch (InterruptedException e) {				}
			// TODO Auto-generated catch black
			e.printStackTrace();
		}
	}

	private Ball ball;
	private Component component;

}

class Ball {

	public void move_ball(Rectangle2D limits) {

		x += dx;

		y += dy;

		if (x < limits.getMinX()) {

			x = limits.getMinX();

			dx = -dx;

		}

		if (x + TAMX >= limits.getMaxX()) {

			x = limits.getMaxX() - TAMX;

			dx = -dx;

		}

		if (y + TAMY >= limits.getMaxY()) {

			y = limits.getMaxY() - TAMY;

			dy = -dy;

		}
	}

	public Ellipse2D getShape() {

		return new Ellipse2D.Double(x, y, TAMX, TAMY);

	}

	private static final int TAMX = 15;

	private static final int TAMY = 15;

	private double x = 0;

	private double y = 0;

	private double dx = 1;

	private double dy = 1;

}

class SheetBall extends JPanel {

	// Add ball

	public void add(Ball b) {

		ball.add(b);

	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		for (Ball b : balls) {

			g2.fill(b.getShape());

		}

	}

	private ArrayList<Ball> balls = new ArrayList<Ball>();

}

class BounceFrame extends JFrame {

	public BounceFrame() {

		setBounds(600, 300, 400, 350);

		setTitle("Bounces");

		sheet = new SheetBall();

		add(sheet, BorderLayout.CENTER);

		JPanel frameButtons = new JPanel();

		putBoton(frameButtons, "Go!", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				PlayGame();
			}

		});

		putBoton(frameButtons, "Exit", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				System.exit(0);

			}

		});

		add(frameButtons, BorderLayout.SOUTH);
	}

	// put buttons

	public void putBoton(Container c, String tittle, ActionListener listener) {

		JButton boton = new JButton(tittle);

		c.add(boton);

		boton.addActionListener(listener);

	}

	// Add ball and bounces 1000 times.

	public void PlayGame() {

		Ball ball = new Ball();

		sheet.add(ball);

		Runnable r = new BallThread(ball, sheet);

		Thread t = new Thread(r);

		t.start();
	}

	private SheetBall sheet;

}