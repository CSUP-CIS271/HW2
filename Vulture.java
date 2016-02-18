/*
 * Vulture.java"
 * Joshua Greer
 * February 16, 2016
 * Java 271 HW2
 */
import java.awt.*;
public class Vulture extends AbstractBird{
  
  private int position = 1;
  public Vulture(int x , int y){
  super(x, y, Color.BLACK);
  
  }
  public void fly(){
 
  if (position == 1){  
     getPosition().y--;
    position++;  
 } else if (position == 2){  
  getPosition().x--;
  position++;  
 }else if (position == 3){  
 getPosition().y++;  
 position++;  
 } else{  
      getPosition().x++;
  position = 1;  
   }  
  }  
 }  
