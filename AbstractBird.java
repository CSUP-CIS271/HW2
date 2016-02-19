/* Jared Horvat
   Java CIS 271
   2/7/16
   HW 2 */

public abstract class AbstractBird implements Bird {

private int x;
private int y;
private Color color;
private Point position;

AbstractBird(int x, int y, Color color) {
 this.x = x;
 this.y = y;
 this.color = color;
 this.position = new Point(x,y);
 }//end constrictor
 
 public int getX() { return x; }
 public int getY() { return y; }
 
 public Point getPosition() {
  return position;
  }//end getposition
  public Color getColor() {
   return color;
   }//end getcolor
   
  public void setColor(Color color) {
  	  this.color = color;
  }
  public void setX(int x) {
  	  position.x = x;
  }
  public void setY(int y) {
  	  position.y = y;
  }
   
   public abstract void fly();
 }//end class