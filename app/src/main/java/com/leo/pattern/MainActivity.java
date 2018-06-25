package com.leo.pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.leo.pattern.creational.abstract_factory.Button;
import com.leo.pattern.creational.abstract_factory.MacFactory;
import com.leo.pattern.creational.abstract_factory.WinFactory;
import com.leo.pattern.creational.builder.HawaiianPizzaBuilder;
import com.leo.pattern.creational.builder.Pizza;
import com.leo.pattern.creational.builder.Waiter;
import com.leo.pattern.creational.factory.Shape;
import com.leo.pattern.creational.factory.ShapeFactory;
import com.leo.pattern.creational.prototype.PrototypeDemo;
import com.leo.pattern.creational.single.DoubleSynchronizedLazySingleton;
import com.leo.pattern.creational.single.EnumSingleton;
import com.leo.pattern.creational.single.HungryLazySingleton;
import com.leo.pattern.creational.single.InnerSingleton;
import com.leo.pattern.creational.single.LazySingleton;
import com.leo.pattern.creational.single.SynchronizedLazySingleton;
import com.leo.pattern.structural.bridge.Animal;
import com.leo.pattern.structural.bridge.Bird;
import com.leo.pattern.structural.bridge.Fish;
import com.leo.pattern.structural.bridge.Fly;
import com.leo.pattern.structural.bridge.Swim;
import com.leo.pattern.structural.facade.Computer;
import com.leo.pattern.structural.proxy.Image;
import com.leo.pattern.structural.proxy.ProxyImage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        testSingleton();
//        testPrototype();
        testBuilder();
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
        WinFactory winFactory = new WinFactory();
        MacFactory macFactory = new MacFactory();

        Button button1 = winFactory.createButton();
        Button button2 = macFactory.createButton();
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

    /**
     * 原型模式
     */
    private void testPrototype() {
        PrototypeDemo demo = new PrototypeDemo(1, "aaa");
        Log.i("testPrototype", "demo:" + demo);
        try {
            PrototypeDemo demo2 = (PrototypeDemo) demo.clone();
            Log.i("testPrototype", "demo2:" + demo2);
            //对象是不同的，但是所属类是相同的
            Log.i("testPrototype", "demo==demo2?" + (demo == demo2));
            Log.i("testPrototype", "demo==demo2?" + (demo.getClass() == demo2.getClass()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 构造者模式
     */
    private void testBuilder() {
        Waiter waiter = new Waiter(new HawaiianPizzaBuilder());
        Pizza pizza = waiter.constructPizza();
        Log.i("testBuilder", "pizza:" + pizza);
    }

    /**
     * 桥接模式
     */
    private void testBridge() {
        Animal animal1 = new Fish(new Swim());
        animal1.todo();

        Animal animal2 = new Bird(new Fly());
        animal2.todo();
    }

    /**
     * 代理模式
     */
    private void testProxy() {
        Image image = new ProxyImage();
        //通过代理类完成工作，内部为实际类完成
        image.displayImage();
    }

    /**
     * 外观模式
     */
    private void testacade() {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
