import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
public class Street
{
    private int xLeft;
    private int yTop;
  public void main(String[] args)
  {
      
  }
  public Street(int x, int y)
  {
    //position of the street
    xLeft = x ;
    yTop = y;
      
  }
  public void draw(Graphics2D g2)
  {
      //drawing instructions
      Point2D.Double r1 = new Point2D.Double(xLeft , yTop + 700 );
      Point2D.Double r2 = new Point2D.Double(xLeft + 1000 , yTop + 700 );
      Line2D.Double street = new Line2D.Double(r1, r2);
      
      g2.draw(street);
     
   }
}
