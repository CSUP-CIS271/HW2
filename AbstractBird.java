/* Project: Aviary.java
* Name: Matt S. Ham
* Date: Feb 8, 2016
* Desc: To get and sec specifics for birds
*/

import java.awt.*;

public abstract class AbstractBird implements Bird{
  private Point position = new Point();
  private Color color;
  AbstractBird(int x, int y){
    position.x= x;
    position.y= y;
  }
  //Pulls the positions for each bird
  public Point getPosition(){
    return position;
  }
  //Pulls the Color for each bird
  public Color getColor(){
    return color;
  }
  //Sets the color for each bird
  public void setColor(Color color){
    this.color = color;
  }
  //Sets the x coordinate
  public void setX(int x){
    position.x = x;
  }
  // sets the y coordinate
  public void setY(int y){
    position.y = y;
  }
  public abstract void fly();{
  }
}
