import java.awt.Color;
import java.awt.Point;

public class Cardinal extends AbstractBird {
	private int move = -1;
	
	public Cardinal(int x, int y) {
		super(new Point(x,y), Color.red);
	}

	@Override
	public Point getPosition() {
		
		return Position ;
	}

	@Override
	public Color getColor() {
		return Color.red;
	}

	@Override
	public void fly() {
		if(getPosition().y == 0){
			move = 1;
		}//end if
		
		if(getPosition().y == 19){
			move = -1;
		}
		setY(getPosition().y + move);
		
	}//end fly

}
