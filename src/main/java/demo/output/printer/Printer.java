package demo.output.printer;

import demo.output.Output;
import org.springframework.stereotype.Component;

public class Printer implements Output {
    private String name;
    public Printer()
    {
        this.setName("printer");
        //System.out.println("Printer has been created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void output() {
        System.out.println(this.getName()+" has printed");
    }
}
