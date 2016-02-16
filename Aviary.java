package BirdPackage;
/**
 * @author Given Bird interface should work with the following client program:
 * Aviary.java
 * Randall Sirota 2/16/2016
 */
import java.awt.*;


public class Aviary {
 public static final int SIZE = 20;
 public static final int PIXELS = 10;

public static void main (String[ ] args) {
 DrawingPanel panel = new DrawingPanel(SIZE*PIXELS, SIZE*PIXELS);
    Graphics g = panel.getGraphics ( );
     
     // create several birds
    Bird [ ] birds = {
        new Cardinal(7, 4), new Cardinal(3, 8),
        new Hummingbird(2, 9), new Hummingbird(16, 11),
       new Bluebird(4, 15), new Bluebird (8, 1),
        new Vulture(3, 2), new Vulture(18, 14),
    };

    while (true)  {
        // clear screen
        g.setColor (Color.WHITE);
        g.fillRect (0,  0,  SIZE*PIXELS,  SIZE*PIXELS);

        // tell each bird to fly, and redraw the bird
        for (Bird bird : birds)  {
               bird.fly ( );
               g.setColor (bird.getColor ( ) ) ;
               Point pos = bird.getPosition ( );
               g.fillOval (  (int)pos.getX( ) * PIXELS, (int)pos.getY( ) * PIXELS, PIXELS ,  PIXELS );
        }

               panel.sleep (500) ;
        }
    }
}