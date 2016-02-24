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
public class Bluebird extends AbstractBird {

    private int down_up = 1;
    private int orientation_left = -1;

    public Bluebird(int x, int y) {
        super(new Point(x, y), Color.BLUE);
    }

    public void fly() {
        if (get_x() == 0) {
            orientation_left = 1;
        }
        if (get_x() == 19) {
            orientation_left = -1;
        }
        if (down_up == 1) {
            down_up = -1;
        } else {
            down_up = 1;
        }
        setBird_position(new Point(get_x() + orientation_left, get_y() + down_up));
    }
}
