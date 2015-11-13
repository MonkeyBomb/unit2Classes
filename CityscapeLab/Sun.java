import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
public class Sun
{
    private int xLeft;
    private int yTop;
  public void main(String[] args)
  {
      
  }
  public Sun(int x, int y)
  {
    //position of the street
    xLeft = x ;
    yTop = y;
      
  }
  public void draw(Graphics2D g2)
  {
      //drawing instructions
      //Draws the Sun
      Ellipse2D.Double Sun = new Ellipse2D.Double(xLeft + 20 , yTop + 20 , 110, 110);
      g2.setColor(Color.YELLOW);
      g2.fill(Sun);
      g2.draw(Sun);
     
     
   }
}
