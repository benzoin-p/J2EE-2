package demo.factory;

import demo.output.displayer.DellDisplayer;

public class DellDisplayerFactory {
    public DellDisplayer createDellDisplayer()
    {
        System.out.println("DellDisplayerFactory is creating DellDisplayer");
        return new DellDisplayer();
    }
}
