 /*
  * Program:   Bluebird.java
  * Author:   Dan Baliczek
  * Last modified:  2/9/2016
  * Description: Bluebird class is a subclass of Bird; requires DrawingPanel.java to run correctly
  */
import java.awt.*;
public class Bluebird extends abstractBirds{
  private int hMove = 1; //positive means right
  private int vMove = -1;//negative means up
  Bluebird(int x, int y){
    super(x, y);
    setColor(Color.BLUE);
  }
  
  //horizontal zigzag movement, initially faces right-up, until it hits edge @ (0,y)(19,y)
  //example of movement: right-up,right-down,*hits edge* left-up, left-down
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
  //checks edge horizontally
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
