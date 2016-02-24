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
public class Vulture extends AbstractBird {

    int pattern = 0;

    public Vulture(int x, int y) {
        super(new Point(x, y), Color.BLACK);
    }

    public void fly() {
        switch (pattern) {
            case 0:
                set_y(get_y() - 1);
                pattern = 1;
                break;
            case 1:
                set_x(get_x() - 1);
                pattern = 2;
                break;
            case 2:
                set_y(get_y() + 1);
                pattern = 3;
                break;
            case 3:
                set_x(get_x() + 1);
                pattern = 0;
                break;
        }
    }
}
