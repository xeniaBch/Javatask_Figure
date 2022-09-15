package Model;

import Enum.Color;
import Interface.Artist;
import Interface.Painter;

public class Triangle extends Figure implements Painter, Artist {

    int base;
    int height;

    public Triangle(char symbol, Color color, int base, int height) {
        super(symbol, color);
        this.base = base;
        this.height = height;
    }


    @Override
    public void figureArea() {
        System.out.println("Square of " +  getClass().getName() + " is " + (double) this.base * this.height / 2);

    }

    @Override
    public void drawFigure() {
        System.out.println("I draw " + getClass().getName() + " with symbol " + getSymbol());
        for (int i = 1, j = 1; i <= this.height; i++, j += 2) {
            for (int space = this.height; space > i; space--)
                System.out.print(" ");
            for (int x = 1; x <= j; x++)
                System.out.print(getSymbol());
            System.out.println();
        }

    }

    @Override
    public void paintFigure() {
        System.out.println( "I paint " + getClass().getName() +" in " + getColor());
    }
}
