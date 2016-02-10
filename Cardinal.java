 /*
  * Program:   Cardinal.java
  * Author:   Dan Baliczek
  * Last modified:  2/9/2016
  * Description: Cardinal class is a subclass of Bird; requires DrawingPanel.java to run correctly
  */
import java.awt.*;
public class Cardinal extends abstractBirds{
  private int move = -1;//negative means up
  Cardinal(int x, int y){
    super(x, y);
    setColor(Color.RED);
  }
  
  //vertical flight for cardinals, ceiling @ 19, floor @ 10, initially moves up
  public void fly(){
    Point check = new Point(getPosition());
    //check ceiling
    if(check.y == 19){
      move = -1;
    }
    //check floor
    if(check.y == 0){
      move = 1;
    }
    //move
    setY(check.y + move);
  }
}
