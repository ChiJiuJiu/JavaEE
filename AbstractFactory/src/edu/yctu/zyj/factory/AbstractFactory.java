package edu.yctu.zyj.factory;

import edu.yctu.zyj.color.Color;
import edu.yctu.zyj.shape.Shape;

/**
 * ���󹤳�
 * 
 * @author ���ˬB
 *
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
