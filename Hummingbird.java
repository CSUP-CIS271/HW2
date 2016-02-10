 /*
  * Program:   Hummingbird.java
  * Author:   Dan Baliczek
  * Last modified:  2/9/2016
  * Description: Hummingbird class is a subclass of Bird; requires DrawingPanel.java to run correctly
  */
import java.awt.*;
import java.util.Random;
public class Hummingbird extends abstractBirds{
  Hummingbird(int x, int y){
    super(x, y);
    setColor(Color.MAGENTA);
  }
  //Random flight pattern for hum~~ from (0,0) to (9,9)
  public void fly(){
    Random coordinate = new Random();
    setX(coordinate.nextInt(10));
    setY(coordinate.nextInt(10));
  }
}
