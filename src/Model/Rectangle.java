package Model;

import Enum.Color;
import Interface.Artist;
import Interface.Painter;



public class Rectangle extends Figure implements Painter, Artist {

    int width;
    int height;

    public Rectangle(char symbol, Color color, int width, int height) {
        super(symbol, color);
        this.width = width;
        this.height = height;
    }


    @Override
    public void figureArea() {
        System.out.println("Square of " + getClass().getName() + " is " + this.width*this.height);

    }

    @Override
    public void drawFigure() {
        System.out.println("I draw " + getClass().getName() + " with symbol " + getSymbol());
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(getSymbol() + " ");
            }
                System.out.println();

        }
    }

    @Override
    public void paintFigure() {
        System.out.println( "I paint" + getClass().getName()+" in " + getColor());
    }
}
