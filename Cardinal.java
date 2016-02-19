/* Jared Horvat
   Java CIS 271
   2/7/16
   HW 2 */

import java.awt.*;

public class Cardinal extends AbstractBird {
 private int neg = -1;
 
  Cardinal(int x, int y) {
  	super(x, y);
  	setColor(Color.RED);
  }//end constrictor
  
  public void fly() {
  	Point bound = new Point(getPosition());
  	
  	if(bound.y == 19) {
      neg = -1;
    }//end if
    if(bound.y == 0) {
      neg = 1;
    }//end if
    
   setY(bound.y + neg);
  }//end fly method
}//end class
