//package BirdPackage;

import java.awt.*;
import java.util.*;
public class Hummingbird extends AbstractBird {
  private boolean up;
  
  
 public Hummingbird(int x, int y) {
  super(x, y, Color.MAGENTA);
  up = true;  //move one unit up on y-axis
 }

 public void fly() {
  Random r = new Random();
  int rx = r.nextInt(10);
  int ry= r.nextInt(10);
  super.getPosition().move(rx, ry);
 }
}
