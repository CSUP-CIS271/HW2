/* Project: Aviary.java
* Name: Matt S. Ham
* Date: Feb 8, 2016
* Desc: To create Cardinal and set path
*/

import java.awt.*;

public class Cardinals extends AbstractBird{
  private int move = -1;//negative means up
  Cardinals(int x, int y){
    super(x, y);
    setColor(Color.RED);
  }

  //vertical flight for cardinals
  public void fly(){
    Point check = new Point(getPosition());
    //ceiling check
    if(check.y == 19){
      move = -1;
    }
    //floor check
    if(check.y == 0){
      move = 1;
    }
    //move
    setY(check.y + move);
  }
}
