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
public interface Bird {

    public Color getBird_color();

    public Point getBird_position();

    public void fly();

}
