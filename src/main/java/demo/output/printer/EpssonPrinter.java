package demo.output.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class EpssonPrinter extends Printer{


    public EpssonPrinter()
    {
        super();
        this.setName("EpssonPrinter");
        System.out.println("EpssonPrinterBean has been created");
    }
}
