package BirdPackage;

/**
 * @author
 * Randall Sirota 2/16/2016
 * CIS271
 */

import java.awt.*;

public abstract class AbstractBird implements Bird {
 private int x;
 private int y;
 private Color color1;
 private Point position;
  
 public Point getPosition() {  
  return position;
 }
 public AbstractBird(int x, int y, Color color1) {
  this.x = x;
  this.y = y; 
  this.color1 = color1;
  this.position = new Point(x,y);
 }
 
 public int getX() {
  return x;
 }
 
 public int getY() {
  return y;
 }
 public String toString() {
  return(x + "," + y);
 }
 
 public Color getColor() {
  return color1;
 }
 
 public abstract void fly();

}
