/*<applet code="Shapes.class" width=500 height=500 >
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Shapes extends Applet implements ActionListener
{
	Button b1,b2;
	String msg;
	Font f1;
	Color c1;
	public void init()
	{
		b1=new Button("circle");
		b2=new Button("square");
		f1=new Font("Timesnewroman",Font.PLAIN,40);
		c1=new Color(1,90,0);
		
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		msg=ae.getActionCommand();
		repaint();
	}
	public void paint(Graphics g)
	{
		//g.setColor(Color.red);
		g.setColor(c1);
		g.setFont(f1);
		if(msg.equals("circle"))
		g.fillOval(100,100,50,50);
		else if(msg.equals("square"))
		g.fillRect(200,200,50,50);
	g.drawString("helloworld",400,400);
	}
}