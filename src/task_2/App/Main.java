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
        test[2].print();
        for(int k=0; k<3; k++){
            if   (test[k] instanceof Magazine){
                Magazine.printMagazines(test);
            } else {
                Book.printBooks(test);
            }
        }



    }}