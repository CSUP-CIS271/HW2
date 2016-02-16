//package BirdPackage;

import java.awt.*;

public class Bluebird2 extends AbstractBird {
 private boolean up;
 
 public Bluebird2(int x, int y) {
  super(x, y, Color.BLUE);
  up = true;  //move one unit up on y-axis
 }
 
 public void fly() {
  
   if (up == true) {
     getPosition().x--;
     getPosition().y--;
   
   }else {
  getPosition().x++;
  getPosition().y++;
   }
  
   if(getPosition().getY() == 0) {
     up = false;
   
   }else if (getPosition().getY() == 19)
     up = true;
  }
}
