package com.leo.pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.leo.pattern.behavioral.chain_responsibility.Accounting;
import com.leo.pattern.behavioral.chain_responsibility.JuniorAccount;
import com.leo.pattern.behavioral.chain_responsibility.MiddleAccount;
import com.leo.pattern.behavioral.chain_responsibility.SeniorAccount;
import com.leo.pattern.behavioral.command.Command;
import com.leo.pattern.behavioral.command.FlipDownCommand;
import com.leo.pattern.behavioral.command.FlipUpCommand;
import com.leo.pattern.behavioral.command.Light;
import com.leo.pattern.behavioral.command.Switch;
import com.leo.pattern.behavioral.interpreter.Expression;
import com.leo.pattern.behavioral.interpreter.OrExpression;
import com.leo.pattern.behavioral.interpreter.TerminalExpression;
import com.leo.pattern.behavioral.iterator.Iterator;
import com.leo.pattern.behavioral.iterator.NameRepository;
import com.leo.pattern.behavioral.mediator.Mediator;
import com.leo.pattern.behavioral.mediator.NormalUser;
import com.leo.pattern.behavioral.mediator.VipUser;
import com.leo.pattern.behavioral.memento.CareTaker;
import com.leo.pattern.behavioral.memento.Originator;
import com.leo.pattern.behavioral.observer.BinaryObserver;
import com.leo.pattern.behavioral.observer.Subject;
import com.leo.pattern.behavioral.state.StartState;
import com.leo.pattern.behavioral.state.State;
import com.leo.pattern.behavioral.state.StateContext;
import com.leo.pattern.behavioral.state.StopState;
import com.leo.pattern.behavioral.strategy.FirstStrategy;
import com.leo.pattern.behavioral.strategy.Scenes;
import com.leo.pattern.behavioral.strategy.SecondStrategy;
import com.leo.pattern.behavioral.strategy.ThirdStrategy;
import com.leo.pattern.behavioral.template.Monopoly;
import com.leo.pattern.behavioral.visitor.Company;
import com.leo.pattern.behavioral.visitor.Visitor;
import com.leo.pattern.behavioral.visitor.VisitorImpl;
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
import com.leo.pattern.structural.adapter.KeyAdapter;
import com.leo.pattern.structural.adapter.KeyBroad;
import com.leo.pattern.structural.adapter.P2P;
import com.leo.pattern.structural.bridge.Animal;
import com.leo.pattern.structural.bridge.Bird;
import com.leo.pattern.structural.bridge.Fish;
import com.leo.pattern.structural.bridge.Fly;
import com.leo.pattern.structural.bridge.Swim;
import com.leo.pattern.structural.composite.ChildComposite;
import com.leo.pattern.structural.composite.NodeComposite;
import com.leo.pattern.structural.composite.Root;
import com.leo.pattern.structural.decorator.HorizontalScrollBar;
import com.leo.pattern.structural.decorator.SimpleWindow;
import com.leo.pattern.structural.decorator.VerticalScrollBar;
import com.leo.pattern.structural.decorator.Window;
import com.leo.pattern.structural.facade.Computer;
import com.leo.pattern.structural.flyweight.BMW;
import com.leo.pattern.structural.flyweight.CarFactory;
import com.leo.pattern.structural.flyweight.CarFlyWeightFactory;
import com.leo.pattern.structural.proxy.Image;
import com.leo.pattern.structural.proxy.ProxyImage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        testSingleton();
//        testPrototype();
//        testBuilder();
//        testChainResponsibility();
        testMediator();
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

    /**
     * 修饰模式
     */
    private void testDecorator() {
        Window window1 = new SimpleWindow();
        Window vertical = new VerticalScrollBar(window1);
        Window horizontal = new HorizontalScrollBar(vertical);
        horizontal.draw();
    }

    /**
     * 享元模式
     */
    private void testFlyWeight() {
        BMW bmw = (BMW) CarFlyWeightFactory.getCar(CarFactory.BMW);
        bmw.start();
    }

    /**
     * 责任链模式
     */
    private void testChainResponsibility() {
        Accounting seniorAccount = new SeniorAccount(null, 10000);
        Accounting middleAccount = new MiddleAccount(seniorAccount, 1000);
        Accounting juniorAccount = new JuniorAccount(middleAccount, 100);
        juniorAccount.responsibility(90000);
    }

    /**
     * 命令模式
     */
    private void testCommand() {
        Light light = new Light();
        Command flipUp = new FlipUpCommand(light);
        Command flipDown = new FlipDownCommand(light);

        Switch sw = new Switch();

        sw.storeAndExecute(flipDown);
        sw.storeAndExecute(flipUp);
    }

    /**
     * 策略模式
     */
    private void testStrategy() {
        FirstStrategy firstStrategy = new FirstStrategy();
        Scenes scenes = new Scenes(firstStrategy);
        scenes.work();
        SecondStrategy secondStrategy = new SecondStrategy();
        scenes = new Scenes(secondStrategy);
        scenes.work();
        ThirdStrategy thirdStrategy = new ThirdStrategy();
        scenes = new Scenes(thirdStrategy);
        scenes.work();
    }

    /**
     * 模板模式
     */
    private void testTemplate() {
        Monopoly monopoly = new Monopoly();
        monopoly.start();
        monopoly.stop();
    }

    /**
     * 访问者模式
     */
    private void testVisitor() {
        Visitor visitorImpl = new VisitorImpl();
        Company company = new Company();
        company.accept(visitorImpl);
    }

    /**
     * 备忘录模式
     */
    private void testMemento() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }

    /**
     * 观察者模式
     */
    private void testObserver() {
        Subject subject = new Subject();

        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

    /**
     * 组合模式
     */
    private void testComposite() {

        Root root = new Root();
        ChildComposite childComposite = new ChildComposite();
        NodeComposite nodeComposite = new NodeComposite();

        root.add(childComposite);
        root.add(nodeComposite);

        root.action();
    }

    /**
     * 状态模式
     */
    private void testState() {
        State start = new StartState();
        State stop = new StopState();

        StateContext context = new StateContext();
        context.setState(start);
        context.handle();

        context.setState(stop);
        context.handle();
    }

    /**
     * 中介者模式
     */
    private void testMediator() {
        Mediator mediator = new Mediator();
        NormalUser normalUser = new NormalUser();
        VipUser vipUser = new VipUser();

        mediator.handle(vipUser, normalUser);
    }

    /**
     * 解释器模式
     */
    private void testInterpreter() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        Expression ori = new OrExpression(robert, john);

        System.out.println("John is male? " + ori.interpret("John"));
    }

    /**
     * 适配器模式
     */
    private void testAdapter() {
        P2P p2p = new P2P("this is a p2p data");
        KeyAdapter adapter = new KeyAdapter(p2p);

        KeyBroad keyBroad = new KeyBroad(adapter);
        keyBroad.action();
    }

    /**
     * 迭代器模式
     */
    private void testIterator() {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
