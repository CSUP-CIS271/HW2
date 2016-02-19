/* Jared Horvat
   Java CIS 271
   2/7/16
   HW 2 */
   
import java.awt.*;

 public class Vulture extends abstractBird {
  private int pos = 1;
   Vulture(int x, int y) {
    super(x, y);
    setColor(Color.BLACK);
    }//end vulture constrictor
  
   public void fly() {
    Point current = new Point(getPosition());
    
    if(pos == 1) {
     setY(current.y - 1);
     pos++;
     }//end if
     else if(pos == 2) {
     setX(current.x - 1);
     pos++;
     }//end else if
     else if(pos == 3) {
     setY(current.y + 1);
     pos++;
     }//end else if
     else {
     setX(current.x + 1);
     pos = 1;
     }//end else
   }//end fly method
  }//end class