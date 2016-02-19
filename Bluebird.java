/* Jared Horvat
   Java CIS 271
   2/7/16
   HW 2 */
   
import java.awt.*;

public class Bluebird extends abstractBird {
 private int plus = 1;
 private int neg = -1;
 
 Bluebird(int x, int y) {
  super(x, y);
  setColor(Color.BLUE);
  
  }//end bluebird
  
  public void fly() {
   Point p = new Point(getPosition());
  
  setX(position.x + direction(getPosition));
  setY(position.y + neg);
  
  if(neg > 0) {
     neg = -1;
   }//end if
   else if(neg < 0) {
   neg = 1;
     }//end else if
  }//end fly method
   
  public int direction(Point current) {
     if(current.x + 1 > Aviary.SIZE - 1) {
       plus = -1;
      }//end if
      if(current.x - 1 < 0) {
        plus = 1;
       }//end if
      return plus;
   }//end method
 }//end class
  