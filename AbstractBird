import java.awt.*;

public abstract class AbstractBird implements Bird {
	public Point Position;
	public Color c;
	public static int x=  getX();
	public static int y = getY();
	abstract public void fly();
	
	public AbstractBird(Point position, Color color){
		this.Position = position;
		this.c = color;
		
	}
	public Point getPosition(int x, int y){
		return Position;
	}
	public void setPosition(Point position) {
		Position = position;
	}
	
	public Color getC() {
		return c;
	}

	public void setColor(Color color) {
		this.c = color;
	}
	
	public static int getX(){
		return x;
	}
	
	public static int getY(){
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
