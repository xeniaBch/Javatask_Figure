package task_2.App;

import task_2.Interface.Printable;
import task_2.Model.Book;
import task_2.Model.Magazine;

public class Main {
    public static void main(String[] args) {
        Printable[] test=new Printable[3];
        test[0]=new Book("Animal Farm");
        test[1]=new Magazine("Guardian");
        test[2]=new Book("Le Petit Prince");

        Magazine.printMagazines(test);
        Book.printBooks(test);

        }



    }