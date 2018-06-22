package com.leo.pattern.creational.factory;

/**
 * @author leo, ZhangWei
 * @date 2018/6/22
 */
public class ShapeFactory {

    public static final String CIRCLE = "Circle";
    public static final String SQUARE = "Square";

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

}
