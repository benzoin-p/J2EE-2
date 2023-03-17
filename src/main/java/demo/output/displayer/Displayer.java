package demo.output.displayer;

import demo.output.Output;

public class Displayer implements Output {
    private String name;
    public Displayer()
    {
        this.setName("displayer");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void output() {
        System.out.println(this.getName()+" has displayed");
    }
}
