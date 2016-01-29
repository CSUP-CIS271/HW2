#HW2

Second homework assignment-

So you saw this in class thursday. Here is what you need to do:

For the next six problems, consider the task of representing types of 
birds in an aviary simulation. Each bird has an (x,y) position and a 
color, and each bird can fly. Different types of birds have different 
flight behavior.
Write an interface called Bird to represent different types of birds. 
The interface should have methods to do the following:
Get the bird’s color.
Get the bird’s (x,y) position as a Point.
Tell a bird to fly. (Each time a bird is told to fly, it will move its 
position once)
You should create an abstract class called AbstractBird that has an 
abstract method fly(). This abstract class should be a parent class of 
each bird class (Cardinal, Hummingbird, Bluebird, and Vulture). The 
declaration of the abstract class should look like “public abstract 
class AbstractBird implements Bird”. 

Your Bird interface should work with the following client program:
```
1  import java.awt.*;
2 
3  public class Aviary {
4	public static final int SIZE = 20;
5	public static final int PIXELS = 10;
6
7	public static void main (String[ ] args) {
8		// create a drawing panel
9		DrawingPanel  panel = new Drawingpanel (SIZE*PIXELS, SIZE*PIXELS);
11		Graphics  g = panel.getGraphics ( );
12		
13		// create several birds
14		Bird [ ] birds = {
15			new Cardinal (7,  4) ,	new Cardinal (3, 8) ,
16			new Hummingbird (2,  9) , new Hummingbird (16, 11) ,
17			new Bluebird (4,  15) ,	new Bluebird (8, 1) ,
18  			new Vulture (3,  2) , new Vulture (18, 14) ,
19		};
20
21		while (true)  {
22			// clear screen
23			g.setColor (Color.WHITE);
24			g.fillRect (0,  0,  SIZE*PIXELS,  SIZE*PIXELS);
25
26			// tell each bird to fly, and redraw the bird
27			for (Bird bird : birds)  {
28			       bird.fly ( );
29			       g.setColor (bird.getColor ( ) ) ;
30			       Point pos = bird.getPosition ( );
31			       g.fillOval (  (int)pos.getX ( ) * PIXELS,
32				             (int)pos.getY ( ) * PIXELS,
33				              PIXELS ,  PIXELS ) ;
34			       }
35
36			       panel.sleep (500) ;
37			}
38		}
39  }
```

6. Write a class called Cardinal that represents cardinals. A cardinal 
is red in color. The cardinal’s movement is vertical. Initially a 
cardinal is moving up. Each time the cardinal is told to fly, it will 
move its position one unit upward on the y-axis (remember that upward is 
negative). If the cardinal hits the edge of the aviary ( a y-coordinate 
of 0 or 19), it turns around and flies in the opposite direction.

Assume that the aviary’s size of 20 is stored in a static constant 
called Aviary.SIZE. You may wish to introduce an abstract class to hold 
behavior that will be common to all bird classes.

7. Write a class called Hummingbird that represents hummingbirds. A 
hummingbird is magenta in color. The hummingbird’s movement is random; 
each time the hummingbird is told to fly, it will pick a new random  
(x,y) position in the range of (0,0) to (9,9). 

8. Write a class called Bluebird that represents bluebirds. A bluebird 
is blue in color. The bluebird’s movement is in a zig-zag pattern. 
Initially the bluebird faces right. The bluebird moves in an alternating 
pattern of up-right, down-right, and so on until it hits the right edge 
of the aviary (x-coordinate of 19),at which point it turns around. 
Subsequent calls to fly will cause the bird to move up-left, down-left, 
up-left, down-left, and so on until it hits the left edge of the aviary.

9. Write a class called Vulture that represents vultures. A vulture is 
black in color. The vulture’s movement is in a counter-clockwise circle 
pattern. Initially the vulture faces up. The first time the vulture 
flies, it moves up by one, then it turns to face left. Its second move, 
it moves left by one and turns to face down. Its third move, it moves 
down and turns to face right. Its fourth move, it moves right by one and 
turns to face up. The pattern repeats in this fashion. 

