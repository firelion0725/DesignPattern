package com.leo.pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leo.pattern.creational.abstract_factory.Color;
import com.leo.pattern.creational.abstract_factory.ColorFactory;
import com.leo.pattern.creational.factory.Shape;
import com.leo.pattern.creational.factory.ShapeFactory;
import com.leo.pattern.creational.single.DoubleSynchronizedLazySingleton;
import com.leo.pattern.creational.single.EnumSingleton;
import com.leo.pattern.creational.single.HungryLazySingleton;
import com.leo.pattern.creational.single.InnerSingleton;
import com.leo.pattern.creational.single.LazySingleton;
import com.leo.pattern.creational.single.SynchronizedLazySingleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testSingleton();
    }

    /**
     * 工厂模式
     */
    private void testFactory() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape(ShapeFactory.CIRCLE);
        shape1.draw();
        Shape shape2 = shapeFactory.getShape(ShapeFactory.SQUARE);
        shape2.draw();
    }

    /**
     * 抽象工厂
     */
    private void testAbstractFactory() {
        com.leo.pattern.creational.abstract_factory.ShapeFactory shapeFactory = new com.leo.pattern.creational.abstract_factory.ShapeFactory();
        com.leo.pattern.creational.abstract_factory.Shape shape1 = shapeFactory.getShape(ShapeFactory.CIRCLE);
        shape1.draw();

        ColorFactory colorFactory = new ColorFactory();
        Color color = colorFactory.getColor(ColorFactory.RED);
        color.color();
    }

    /**
     * 单例模式
     */
    private void testSingleton() {
        LazySingleton.getInstance().show();
        HungryLazySingleton.getInstance().show();
        SynchronizedLazySingleton.getInstance().show();
        DoubleSynchronizedLazySingleton.getSingleton().show();
        InnerSingleton.getInstance().show();
        EnumSingleton.INSTANCE.show();
    }
}
