import java.awt.*;
import javax.swing.*;

public class IterativeControl2
{
   public static void main (String [] args)
   {
      JFrame j = new JFrame();//JFrame is the window; window is a depricated class
      MyPanel m = new MyPanel();
      j.setSize(m.getSize());
      j.add(m); //adds the panel to the frame so that the picture will be drawn
      j.setVisible(true); //allows the frame to be shown.
      j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit	
   }
}

class MyPanel extends JPanel 
{
   MyPanel()
   {
      setSize(800, 600); // setting the size of the window
		setVisible(true); //it's like calling the repaint method.
	}
	
	public void paintComponent(Graphics g)
	{

      // 1)  Generate a number n between 5 and 10
      int n = 5 + (int) (Math.random()*6);
      
      // 2)  Display the n
      System.out.println(n);
      // g.drawChars((""+n).toCharArray(), 0, 2, 50, 50);
      
      // 3)  Display n random blue lines (initialize the x and y values of the end points
      //     using random number) using a for loop.
      g.setColor(Color.BLUE);
      for (int i = 0; i < n; i++)
      {
         g.drawLine(
            (int) (Math.random()*800), 
            (int)(Math.random()*600), 
            (int)(Math.random()*800), 
            (int)(Math.random()*600)
         );
      }
      
      // 4)  Display n random green lines using a while loop
      g.setColor(Color.GREEN);
      int i = 0;
      while (i < n)
      {
         g.drawLine(
            (int) (Math.random()*800), 
            (int)(Math.random()*600), 
            (int)(Math.random()*800), 
            (int)(Math.random()*600)
         );
         i++;
      }
   }
}



