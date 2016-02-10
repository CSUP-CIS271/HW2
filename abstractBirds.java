 /*
  * Program:  abstractBirds.java
  * Author:   Dan Baliczek
  * Last modified:  2/9/2016
  * Description: The parent class of Cardinal, Hummingbird, Bluebird, and Vulture; requires DrawingPanel.java to run correctly
  */
import java.awt.*;
public abstract class abstractBirds implements Bird{
  private Point position = new Point();
  private Color color;
  abstractBirds(int x, int y){
    position.x= x;
    position.y= y;
  }
  public Point getPosition(){
    return position;
  }
  public Color getColor(){
    return color;
  }
  public void setColor(Color color){
    this.color = color;
  }
  public void setX(int x){
    position.x = x;
  }
  public void setY(int y){
    position.y = y;
  }
  public abstract void fly();
}
