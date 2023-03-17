package demo;

import demo.computer.LenovoComputer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        LenovoComputer lenovoComputer = (LenovoComputer) applicationContext.getBean("lenovoComputer");
        lenovoComputer.Display();
        lenovoComputer.Print();
    }
}
