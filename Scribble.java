/*<applet code="Scribble.class" width=500 height=500 >
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Scribble extends Applet implements MouseMotionListener,MouseListener,ItemListener,ActionListener
{
    private int last_x,last_y;
	Choice color;
	Button clean;
	String msg;
	public void init()
	{
		
		
		this.addMouseMotionListener(this);
		this.addMouseListener(this); 
		
			
		color.add("blue");
		color.add("green");
	    color.add("red");
		color.add("yellow");
		color.add("orange");
		color.add("cyan");
		add(color);
		
		
		clean=new Button("clean");
		add(clean);
		
		color.addItemListener(this);
		clean.addActionListener(this);
		
	}
    public void itemStateChanged(ItemEvent ie)
	{
		//Graphics g=this.getGraphics();
		msg=color.getSelectedItem();
		if(msg.equals("blue"))
			setForeground(Color.blue);
		else if(msg.equals("orange"))
			setForeground(Color.orange);
		else if(msg.equals("cyan"))
			setForeground(Color.cyan);
		else if(msg.equals("green"))
			setForeground(Color.green);
		else if(msg.equals("red"))
			setForeground(Color.red);
		else if(msg.equals("yellow"))
			setForeground(Color.yellow);
	}
	/*public void paint(Graphics g)
	{
		msg=color.getSelectedItem();
		if(msg.equals("green"))
			//setForeground(Color.green);
		    g.setColor(Color.blue);
		else if(msg.equals("red"))
			g.setColor(Color.red);
	}*/
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		last_x=me.getX();
		last_y=me.getY();
	}
	public void mouseDragged(MouseEvent me)
	{
		Graphics g=this.getGraphics();
		int x=me.getX(),y=me.getY();
		g.drawLine(last_x,last_y,x,y);
		last_x=x;last_y=y;
	}
	public void mouseExited(MouseEvent me)
	{
	}
	public void mouseEntered(MouseEvent me)
	{
	}
	public void mouseMoved(MouseEvent me)
	{
		showStatus("mousemoved");
	}
	public void mouseReleased(MouseEvent me)
	{
	}
	public void mouseClicked(MouseEvent me)
	{
	}
}