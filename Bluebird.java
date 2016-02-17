import java.awt.*;
public class Bluebird extends AbstractBird {

private boolean left;
int a = 0;
  
public Bluebird (int x, int y) {
  super(x, y, Color.BLUE);
  left = true;
}

public void fly() {
  if (left== true) {
  if (a==0) {
    getPosition().x--;
    getPosition().y--;
    a=1;
  }
  else if (a==1){
    getPosition().x--;
    getPosition().y++;
    a=0;
  }
}
else {
  if (a==0) {
    getPosition().x++;
    getPosition().y--;
    a=1;
  }
  else if (a==1){
    getPosition().x++;
    getPosition().y++;
    a=0;
  }
}
if(getPosition().getX() == 0) {
  left=false;
} else if (getPosition().getX() == 19) {
  left = true;
  }
 }
}
  
