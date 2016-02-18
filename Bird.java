import java.awt.*;
public interface Bird {
  public Point getPosition();
  public Color getColor();
  public int getX();//not necessary in the interface, variables declared in the abstract class
  public int getY();//not necessary in the interface, variables declared in the abstract class
  public void fly();

}
