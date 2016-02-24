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
public class Cardinal extends AbstractBird {

    private int orientation = -1;

    public Cardinal(int x, int y) {
        super(new Point(x, y), Color.RED);
    }

    public void fly() {
        if (getBird_position().y == 0) {
            orientation = 1;
        }
        if (getBird_position().y == 19) {
            orientation = -1;
        }
        set_y(getBird_position().y + orientation);
    }
}
