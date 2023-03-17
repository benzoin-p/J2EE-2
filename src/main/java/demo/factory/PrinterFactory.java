package demo.factory;

import demo.output.printer.EpssonPrinter;
import demo.output.printer.HPPrinter;
import demo.output.printer.Printer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrinterFactory {

    @Bean
    public Printer hPPrinter()
    {
        System.out.println("PrinterFactory is creating HPPrinter");
        return new HPPrinter();
    }

    @Bean
    public Printer ePssonPrinter()
    {
        System.out.println("PrinterFactory is creating EpssonPrinter");
        return new EpssonPrinter();
    }
}
