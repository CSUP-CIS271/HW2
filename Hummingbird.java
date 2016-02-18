/*
 * Hummingbird.java"
 * Joshua Greer
 * February 16, 2016
 * Java 271 HW2
 */
import java.awt.*;
import java.util.*;
public class Hummingbird extends AbstractBird{

  public Hummingbird(int x , int y){
  super(x, y, Color.MAGENTA);
 
  }
  public void fly(){
   Random r = new Random();
   int rx = r.nextInt(10);
   int ry = r.nextInt(10);
   super.getPosition().move(rx,ry);
  }
}
