package demo.computer;

import demo.output.displayer.Displayer;
import demo.output.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Computer {

    private Printer printer;

    private Displayer displayer;

    public Computer()
    {
        //System.out.println("Computer has been created");
    }

    public void Display()
    {
        displayer.output();
    }

    public void Print()
    {
        printer.output();
    }

}
