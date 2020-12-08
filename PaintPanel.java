import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class PaintPanel extends JPanel implements MouseListener,
	ActionListener, MouseMotionListener
	{
		private static final long serialVersionUID = 1L;
		
		private final ArrayList<Point> _points = new ArrayList<>();
		
		private int _size = 10;
		private boolean _clear = false;
		private Color _color = Color.BLACK;
		
		JButton Black = new JButton("Black");
		JButton Red = new JButton("Red");
		JButton Yellow = new JButton("Yellow");
		JButton Grey = new JButton("Grey");
		JButton Magenta = new JButton("Magenta");
		JButton Pink = new JButton("Pink");
		JButton Orange = new JButton("Orange");
		JButton Green = new JButton("Green");
		
		JButton Small = new JButton("Small");
		JButton Medium = new JButton("Medium");
		JButton Large = new JButton("Large");
		JButton Clear = new JButton("Clear");
		
		public PaintPanel() 
		{
			super();
			setBackground(Color.WHITE);
			//this.setLayout(new FlowLayout());
			BoxLayout Layout1 = new BoxLayout(this, BoxLayout.Y_AXIS);
	        this.setLayout(Layout1);
	        this.add(Box.createHorizontalGlue());

			Black.addActionListener(this);
			Red.addActionListener(this);
			Yellow.addActionListener(this);
			Grey.addActionListener(this);
			Magenta.addActionListener(this);
			Pink.addActionListener(this);
			Orange.addActionListener(this);
			Green.addActionListener(this);
			Small.addActionListener(this);
			Medium.addActionListener(this);
			Large.addActionListener(this);
			Clear.addActionListener(this);
			addMouseListener(this);
			addMouseMotionListener(this);
			
			this.add(Black);
			this.add(Red);
			this.add(Yellow);
			this.add(Grey);
			this.add(Magenta);
			this.add(Pink);
			this.add(Orange);
			this.add(Green);
			this.add(Small);
			this.add(Medium);
			this.add(Large);
			this.add(Clear);
		
		}
				
		public void paintComponent(Graphics g) {
			//display the points
			super.paintComponent(g);
			if (!_clear) {	
				for (int i = 0; i < _points.size(); ++i) 
				{
					Point point = _points.get(i);
					g.setColor(point.getColor());
					g.fillOval(point.getXPos(),  point.getYPos(),  point.getSize(), point.getSize());
				}
			}
			_clear = false;
		}
		
		
		public void actionPerformed(ActionEvent e)
		{
			//button event
			if (e.getSource() == Black)
			{
				_color = Color.BLACK;
			}
			
			else if (e.getSource() == Red) 
			{
				_color = Color.RED;
			}
			
			else if (e.getSource() == Yellow) 
			{
				_color = Color.YELLOW;
			}
			
			else if (e.getSource() == Grey) 
			{
				_color = Color.GRAY;
			}
			
			else if (e.getSource() == Magenta) 
			{
				_color = Color.MAGENTA;
			}
			
			else if (e.getSource() == Pink) 
			{
				_color = Color.PINK;
			}
			
			else if (e.getSource() == Orange) 
			{
				_color = Color.ORANGE;
			}
			
			else if (e.getSource() == Green) 
			{
				_color = Color.GREEN;
			}
			
			else if (e.getSource() == Small)
			{
				_size = 10;
			}
			
			else if (e.getSource() == Medium)
			{
				_size = 20;
			}
			
			else if (e.getSource() == Large)
			{
				_size = 30;
			}
			
			else if (e.getSource() == Clear)
			{
				_points.clear();
				_clear = true;
			}
			repaint();
		}
	
		
		public void mousePressed(MouseEvent e)
		{
			_points.add(new Point(e.getX(), e.getY(), _color, _size));
			repaint();
		}
		
		public void mouseMoved(MouseEvent e)
		{
			
		}
		
		public void mouseDragged(MouseEvent e)
		{
			_points.add(new Point(e.getX(), e.getY(), _color, _size));
			repaint();
		}
		
		public void mouseReleased(MouseEvent e)
		{
			
		}
		
		public void mouseEntered(MouseEvent e)
		{
			
		}
		
		public void mouseExited(MouseEvent e)
		{
			
		}
		
		public void mouseClicked(MouseEvent e)
		{
			
		}
	}
	
	
	
	
	
	
	
	
	
	