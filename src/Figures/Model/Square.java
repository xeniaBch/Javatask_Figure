package Figures.Model;

import Figures.Enum.Color;
import Figures.Interface.Artist;
import Figures.Interface.Painter;

public class Square extends Figure implements Painter, Artist {

    int side;


    public Square(char symbol, Color color, int side) {
        super(symbol, color);
        this.side = side;
    }


    @Override
    public double figureArea() {
        return this.side*this.side;
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

    @Override
    public String toString() {
        return "Square{" +
                "square=" + figureArea() +
                '}';
    }
}
