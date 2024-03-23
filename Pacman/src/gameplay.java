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
	public Game(){  //constructor
		Dimension dimension = new Dimension(Game.width,Game.height);
		setPreferredSize(dimension);
		setMinimumSize(dimension);
		setMaximumSize(dimension);
		addKeyListener(this);
		map = new Map();
	}
	