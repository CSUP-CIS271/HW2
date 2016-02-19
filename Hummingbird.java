/* Jared Horvat
   Java CIS 271
   2/11/16
   HW 2 */
   
 import java.awt.*;
 import java.util.*;
 
  public class Hummingbird extends abstractBird{
   Hummingbird(int x, int y) {
    super(x, y);
    setColor(Color.MAGENTA);
    }//end Hummingbird constrictor
    
   public void fly() {
    Random spawn = new Random();
    setX(spawn.nextInt(10));
    setY(spawn.nextInt(10));
    }//end fly method
 }//end class