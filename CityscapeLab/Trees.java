import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
public class Trees
{
    private int xLeft;
    private int yTop;
  public void main(String[] args)
  {
      
  }
  public Trees(int x, int y)
  {
    //position of the street
    xLeft = x ;
    yTop = y;
      
  }
  public void draw(Graphics2D g2)
  {
      //drawing instructions
      //Drawing the Leaves of the tree
      Ellipse2D.Double TreeLeaf = new Ellipse2D.Double(xLeft + 150, yTop + 290 , 110, 110);
      Ellipse2D.Double TreeLeaf2 = new Ellipse2D.Double(xLeft + 70, yTop + 290 , 110, 110);
      Ellipse2D.Double TreeLeaf3 = new Ellipse2D.Double(xLeft + 110, yTop + 250 , 110, 110);
      
      g2.draw(TreeLeaf);
      g2.draw(TreeLeaf2);
      g2.draw(TreeLeaf3);
      //Setting the colour of the tree leaves
      g2.setColor(Color.GREEN);
      g2.fill(TreeLeaf);
      g2.fill(TreeLeaf2);
      g2.fill(TreeLeaf3);
       //The main of the tree
       
      Rectangle TreeMain = new Rectangle(xLeft + 149, yTop + 350,30,200);
       
      g2.draw(TreeMain);
      // Setting the colour of the bark
      g2.getColor();
      g2.fill(TreeMain);
    }
   }

