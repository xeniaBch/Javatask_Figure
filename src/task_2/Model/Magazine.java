package task_2.Model;

import task_2.Interface.Printable;

public class Magazine implements Printable {
    private String name;
    @Override
    public void print() {
        System.out.println("Print " + getClass().getSimpleName() + " " + getName());
    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable p: printable) {
            if (p instanceof Magazine)
                p.print();
        }
    }
}

