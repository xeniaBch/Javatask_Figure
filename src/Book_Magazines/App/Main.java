package Book_Magazines.App;

import Book_Magazines.Interface.Printable;
import Book_Magazines.Model.Book;
import Book_Magazines.Model.Magazine;

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