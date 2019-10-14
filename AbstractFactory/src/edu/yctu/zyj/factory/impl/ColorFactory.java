package edu.yctu.zyj.factory.impl;

import edu.yctu.zyj.color.Color;
import edu.yctu.zyj.color.impl.Blue;
import edu.yctu.zyj.color.impl.Green;
import edu.yctu.zyj.color.impl.Red;
import edu.yctu.zyj.factory.AbstractFactory;
import edu.yctu.zyj.shape.Shape;

/**
 * 颜色工厂(具体工厂)
 * 
 * @author 赵宜珺
 *
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

}
