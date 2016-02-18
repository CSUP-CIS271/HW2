/*
 * Cardinal.java"
 * Joshua Greer
 * February 16, 2016
 * Java 271 HW2
 */
import java.awt.*;
public class Cardinal extends AbstractBird{
  private boolean up;

  public Cardinal(int x , int y){
  super(x, y, Color.RED);
  up = true;

  }
  public void fly(){
    if(up == true) {
      getPosition().y--;
    }else {
      getPosition().y++;
    }
    if(getPosition().getY() <= 0) {
      up = false;
    }else if (getPosition().getY() >= 19)
      up = true;
  }
}
