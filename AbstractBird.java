import java.awt.*;
public abstract class AbstractBird implements Bird {

private int x;
private int y;
private Color color;
private Point position;

AbstractBird(int x, int y, Color color){
this.x = x;
this.y=y;
this.color = color;
this.position = new Point(x,y);

}

public Color getColor(){
  return color;
}
public Point getPosition() {
  return position;
}
public int getX() { return x; }
public int getY()  { return y;}

public abstract void fly();
}
