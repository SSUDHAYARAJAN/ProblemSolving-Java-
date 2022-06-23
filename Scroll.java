/*<applet code="Scroll.class" width=500 height=600>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
public class Scroll extends Applet implements AdjustmentListener 
{
	Scrollbar s1,s2,s3;
	Color c;
	int i,j,k;
	Random rand;
	public void init()
	{
	   i=1;
	   j=2;
	   k=3;
	   rand=new Random();
	   s1=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,500);
	   s2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,500);
	   s3=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,500);
	   add(s1);
	   add(s2);
	   add(s3);
	   s1.addAdjustmentListener(this);	   
	   s2.addAdjustmentListener(this);	   
	   s3.addAdjustmentListener(this);	   
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		c=new Color(i,j,k);
		setBackground(c);
		i=(int)(100*rand.nextDouble());
		j=(int)(100*rand.nextDouble());
		k=(int)(100*rand.nextDouble());
		repaint();
	}
}
