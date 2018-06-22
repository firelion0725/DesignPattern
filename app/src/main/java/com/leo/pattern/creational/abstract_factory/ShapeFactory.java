package com.leo.pattern.creational.abstract_factory;

/**
 * @author leo, ZhangWei
 * @date 2018/6/22
 */
public class ShapeFactory extends AbstractShapeFactory{

    public static final String CIRCLE = "Circle";
    public static final String SQUARE = "Square";

    @Override
    public Shape getShape(String shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            default:
        }

        return shape;
    }

    @Override
    Color getColor(String color) {
        return null;
    }

}
