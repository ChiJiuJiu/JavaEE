package edu.yctu.zyj.factory.impl;

import edu.yctu.zyj.color.Color;
import edu.yctu.zyj.factory.AbstractFactory;
import edu.yctu.zyj.shape.Shape;
import edu.yctu.zyj.shape.impl.Circle;
import edu.yctu.zyj.shape.impl.Rectangle;
import edu.yctu.zyj.shape.impl.Square;

/**
 * ��״����(���幤��)
 * 
 * @author ���ˬB
 *
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

}
