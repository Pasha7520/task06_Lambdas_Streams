package task2;

import java.util.Scanner;

public class Functional implements Command {
    private String name;

    public Functional() {
    }

    public Functional(String name) {
        this.name = name;
    }

    @Override
    public void execute(String str) {
        System.out.println(name+" :"+str);
    }

}
