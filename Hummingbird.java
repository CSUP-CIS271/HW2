import java.awt.*;
import java.util.*;
public class Hummingbird extends AbstractBird {

public Hummingbird (int x, int y) {
  super(x, y, Color.MAGENTA);
}

public void fly(){
  Random r = new Random();
  int ax = r.nextInt(10);
  int ay = r.nextInt(10);
  super.getPosition().move(ax,ay);
  }
 }
