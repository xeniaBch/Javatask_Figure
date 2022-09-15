package task_2.Model;

import task_2.Interface.Printable;

public class Book implements Printable {

    private String name;
    @Override
    public void print(){
        System.out.println("Print " + getClass().getSimpleName()  + " " + getName());
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void  printBooks(Printable[] printable){
        for (Printable p: printable) {
            if (p instanceof Book)
                p.print();
        }
    }
}
