package demo.output.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class HPPrinter extends Printer{

    public HPPrinter()
    {
        super();
        this.setName("HPPrinter");
        System.out.println("HPPrinterBean has been created");
    }
}
