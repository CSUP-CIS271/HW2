/* Project: Aviary.java
* Name: Matt S. Ham
* Date: Feb 8, 2016
* Desc: To create Vulture and set flight
*/

import java.awt.*;

public class Vulture extends AbstractBird{
  private int pos = 1; //Position will determine which direction the vulture is facing
  Vulture(int x, int y){
    super(x, y);
    setColor(Color.BLACK);
  }

  //Circular pattern, initially faces up
  public void fly(){
    Point current = new Point(getPosition());
    if (pos == 1){
      setY(current.y-1);//Up
      pos++;
    } else if (pos == 2){
      setX(current.x-1);//left
      pos++;
    }else if (pos == 3){
      setY(current.y+1);//Down
      pos++;
    } else{
      setX(current.x+1);//Right
      pos = 1;
    }
  }
}
