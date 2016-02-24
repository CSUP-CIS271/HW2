/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviary;

import java.awt.Color;
import java.awt.Point;

import java.util.Random;

/**
 *
 * @author Vitor
 */
public class Hummingbird extends AbstractBird {

    public Hummingbird(int x, int y) {
        super(new Point(x, y), Color.MAGENTA);

    }

    public void fly() {
        Random rad = new Random();
        setBird_position(new Point(rad.nextInt(10), rad.nextInt(10)));
    }
}
