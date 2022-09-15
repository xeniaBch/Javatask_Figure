package Model;

import Enum.Color;
import Interface.Artist;
import Interface.Painter;

public class Square extends Figure implements Painter, Artist {

    int side;


    public Square(char symbol, Color color, int side) {
        super(symbol, color);
        this.side = side;
    }


    @Override
    public void figureArea() {
        System.out.println("Square of " + getClass().getName() + " is " + this.side*this.side);

    }
    @Override
    public void drawFigure() {
        System.out.println("I draw " + getClass().getName() + " with symbol " + getSymbol());
        for (int i = 0; i < this.side; i++) {
            for (int j = 0; j < this.side; j++) {
                System.out.print(getSymbol() + " ");
            }
            System.out.println();

        }
    }

    @Override
    public void paintFigure() {
        System.out.println( "I paint " + getClass().getName() +" in " + getColor());
    }
}
