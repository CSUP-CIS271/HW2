import java.awt.*;

public class Vulture extends AbstractBird{
  private boolean left;
  int q = 1; 
  
  public Vulture(int x, int y){
    super(x, y, Color.BLACK);
    left = true;
   }
  
  public void fly(){    
    if(q == 1){
     getPosition().y--;
     getPosition().x--;
    }
  
    if(q == 2){
      getPosition().x--;
      getPosition().y++;
    }//end of if
    
    if(q == 3){
     getPosition().x++;
     getPosition().y++;
    }//end of if
    
    if(q == 4){
     getPosition().x++;
     getPosition().y--;
    }//end of if
    q++;
    
      if(q==5){
     q = 1; 
    }
  }  
}