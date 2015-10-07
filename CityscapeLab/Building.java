import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
public class Building
{
    private int xLeft;
    private int yTop;
  public void main(String[] args)
  {
      
  }
  public Building(int x, int y)
  {
    //position of the building
    xLeft = x + 300;
    yTop = y + 100;
      
  }
  public void draw(Graphics2D g2)
  {
      //drawing instructions
      //House
      Rectangle body = new Rectangle(xLeft + 50, yTop + 150,500,400);
      Rectangle wind1 = new Rectangle(xLeft + 100, yTop + 200,100,100);
      Rectangle wind2 = new Rectangle(xLeft + 400, yTop + 200,100,100);
      Rectangle door = new Rectangle(xLeft + 260, yTop + 390,70,160);
      Ellipse2D.Double doorKnob = new Ellipse2D.Double(xLeft + 305, yTop + 460, 20, 26);
      //roof of house
      Point2D.Double r1 = new Point2D.Double(xLeft + 50, yTop + 150);
      Point2D.Double r2 = new Point2D.Double(xLeft + 300, yTop);
      Point2D.Double r3 = new Point2D.Double(xLeft + 550, yTop + 150);
      Point2D.Double r4 = new Point2D.Double(xLeft + 300, yTop );
      Line2D.Double roof = new Line2D.Double(r1, r2);
      Line2D.Double roof2 = new Line2D.Double(r3, r4);
      
      g2.draw(body);
      g2.draw(wind1);
      g2.draw(wind2);
      g2.draw(door);
      g2.draw(doorKnob);
      g2.draw(roof);
      g2.draw(roof2);
      
      // Garage
      Rectangle bodyG = new Rectangle(xLeft - 250, yTop + 250,300,300);
      
      
      
      g2.draw(bodyG);
      
     
   }
}