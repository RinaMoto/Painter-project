import java.awt.Color;

public class Point {
	private int _xPos;
	private int _yPos;
	private Color _color;
	private int _size;
	
	public Point(int xPos, int Ypos, Color color, int size)
	{
		_xPos = xPos;
		_yPos = Ypos;
		_color = color;
		_size = size;
	}
	
	public int getXPos() {
		return _xPos;
	}
	
	public int getYPos() {
		return _yPos;
	}
	
	public Color getColor()
	{
		return _color;
	}
	
	public int getSize()
	{
		return _size;
	}
}


