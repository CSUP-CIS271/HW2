import java.awt.*;
public class Vulture extends AbstractBird {
int a = 1;
  
public Vulture (int x, int y) {
  super(x, y, Color.BLACK);
}

public void fly() {
  if (a==1) {
    getPosition().y--;
    a++;
  }
  else if (a==2){
    getPosition().x--;
    a++;
  }
else if (a ==3) {
    getPosition().y++;
    a++;
  }
  else {
    getPosition().x++;
    a=1;
  }
 }
}
