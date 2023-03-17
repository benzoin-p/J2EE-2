package demo.computer;

import demo.output.displayer.DellDisplayer;
import demo.output.displayer.Displayer;
import demo.output.printer.HPPrinter;
import demo.output.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class LenovoComputer extends Computer{

    @Resource(name = "hPPrinter")
    private Printer printer;

    @Autowired
    private Displayer displayer;

    public LenovoComputer()
    {
        super();
        System.out.println("LenovoComputer has been created");
    }

    @Override
    public void Display() {
        displayer.output();
    }

    @Override
    public void Print() {
        printer.output();
    }
}
