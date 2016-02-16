package BirdPackage;

/**
 * @author
 * Randall Sirota 2/16/2016
 * CIS271
 */

import java.awt.*;

public class Cardinal extends AbstractBird {
 private boolean up;
 
 public Cardinal(int x, int y) {
  super(x, y, Color.RED);
  up = true;  //move one unit up on y-axis
 }
 
 public void fly() {
  
   if (up == true) {
     getPosition().y--;
   
   }else {
	 getPosition().y++;
   }
  
   if (getPosition().getY() == 0) {
     up = false;
   
   }else if (getPosition().getY() == 19)
     up = true;
  }
}
