/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviary;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Vitor
 */
public abstract class AbstractBird implements Bird {

    private Point bird_position;
    private Color bird_color;

    public abstract void fly();

    public AbstractBird(Point position, Color bird_color) {
        this.bird_position = position;
        this.bird_color = bird_color;
    }

    public Color getBird_color() {
        return bird_color;
    }

    public void setBird_color(Color bird_color) {
        this.bird_color = bird_color;
    }

    public Point getBird_position() {
        return bird_position;
    }

    public void setBird_position(Point bird_position) {
        this.bird_position = bird_position;
    }

    public int get_x() {
        return bird_position.x;
    }

    public void set_x(int x) {
        bird_position.x = x;
    }

    public int get_y() {
        return bird_position.y;
    }

    public void set_y(int y) {
        bird_position.y = y;
    }
}
