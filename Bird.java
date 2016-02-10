 /*
  * Program:   Bird.java
  * Author:   Dan Baliczek
  * Last modified:  2/9/2016
  * Description: The interface; requires DrawingPanel.java to run correctly
  */
import java.awt.*;
interface Bird{
  public Color getColor();
  public Point getPosition();
  public void fly();
}
