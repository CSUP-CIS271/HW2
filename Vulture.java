 /*
  * Program:   Vulture.java
  * Author:   Dan Baliczek
  * Last modified:  2/9/2016
  * Description: Vulture class is a subclass of Bird; requires DrawingPanel.java to run correctly
  */
import java.awt.*;
public class Vulture extends abstractBirds{
  private int pos = 1; //Position will determine which direction the vulture is facing
  Vulture(int x, int y){
    super(x, y);
    setColor(Color.BLACK);
  }
  
  //Circular pattern, xclockwise, initially faces up
  public void fly(){
    Point current = new Point(getPosition());
    if (pos == 1){
      setY(current.y-1);//move up
      pos++;
    } else if (pos == 2){
      setX(current.x-1);//move left
      pos++;
    }else if (pos == 3){
      setY(current.y+1);//move down
      pos++;
    } else{
      setX(current.x+1);//move right
      pos = 1;
    }
  }
}
