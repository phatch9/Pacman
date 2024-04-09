import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;


public class Gameplay extends Canvas implements Runnable,KeyListener
{
    
	private static final long serialVersionUID = 1L;
	public static final int width = 800,height = 640;
	public boolean isRunning = false;
	public Thread thread;
	public Player player;
	public Map map;
	public Gameplay(){  //constructor
		Dimension dimension = new Dimension(Gameplay.width,Gameplay.height);
		setPreferredSize(dimension);
		setMinimumSize(dimension);
		setMaximumSize(dimension);
		addKeyListener(this);
		map = new Map();
	}
	private void update(){ //update the graphics
		BufferStrategy bs = getBufferStrategy();
		if (bs == null){
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, Game.width,Game.height);
		map.update(g);
		g.dispose();
		bs.show();
	}

	private void move(){     //movement of components
	}

	public synchronized void start(){
		if(isRunning) return;
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop()
	{
		if(!isRunning) return;
		isRunning = false
		try {
			thread.join() 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@override
	public void run() {
		int fps = 0  
		double timer = System.currentTimeMillis();
		long lastTime = System.nanoTime();
		double target = 60.0;
		double delta = 0;
		double ns = 1000000000/target;

		while (isRunning) {
			long now = System 
		}
	}
}

