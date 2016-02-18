import java.awt.*;
/*
 * Bluebird.java"
 * Joshua Greer
 * February 16, 2016
 * Java 271 HW2
 */
public class Bluebird extends AbstractBird{
  private boolean left;
  int q = 0;

  public Bluebird(int x , int y){
  super(x, y, Color.BLUE);
 // left = true;

  }
  public void fly(){
    
    if(left == true) {
      
      if(q == 0){
        getPosition().x--;
        getPosition().y--;
        q = 1;
      }
       else if(q == 1){
        getPosition().x--;
        getPosition().y++;
        q = 0;
      }
      
    }
     else{
        if(q == 0){
        getPosition().x++;
        getPosition().y--;
        q=1;
      }
       else if(q == 1){
        getPosition().x++;
        getPosition().y++;
        q = 0;
      }
    }
    if(getPosition().getX() <= 0) {
      left = false;
    } else if (getPosition().getX() >= 19)
      left = true;
  }
}
