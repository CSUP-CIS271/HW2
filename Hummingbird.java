/* Project: Aviary.java
* Name: Matt S. Ham
* Date: Feb 8, 2016
* Desc: To create Hummingbird and set motion
*/

import java.awt.*;
import java.util.Random;

public class Hummingbird extends AbstractBird{
  Hummingbird(int x, int y){
    super(x, y);
    setColor(Color.GREEN);
  }
  //Random flight pattern for hum
  public void fly(){
    Random coordinate = new Random();
    setX(coordinate.nextInt(10));
    setY(coordinate.nextInt(10));
  }
}
