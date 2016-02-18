/* Project: Aviary.java
* Name: Matt S. Ham
* Date: Feb 8, 2016
* Desc: To create Bluebird and set its motion
*/

import java.awt.*;

public class Bluebird extends AbstractBird{
  private int hMove = 1; //positive means right
  private int vMove = -1;//negative means up
  Bluebird(int x, int y){
    super(x, y);
    setColor(Color.BLUE);
  }

  //horizontal zigzag movement, initially faces right-up
  public void fly(){
    Point pos = new Point(getPosition());
    setX(pos.x + direction(getPosition()));
    setY(pos.y + vMove);
    if (vMove>0){
      vMove = -1;
    } else if (vMove<0){
        vMove=1;
      }
  }
  //horizontally checks edges
  public int direction(Point current){
    if(current.x+1>Aviary.SIZE-1){
      hMove=-1;
    }
    if(current.x-1<0){
      hMove=1;
    }
    return hMove;
  }
}
