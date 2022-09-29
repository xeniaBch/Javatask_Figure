package Figures.Model;
import Figures.Enum.Color;
import Figures.Interface.Artist;
import Figures.Interface.Painter;

public class Figure implements Painter, Artist {

    private char symbol;
    private Color color;

    public Figure(char symbol, Color color) {
        this.symbol = symbol;
        this.color = color;
    }

    public char getSymbol() {
        return symbol;
    }

    public Color getColor() {
        return color;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double figureArea(){
        System.out.println("Calculate Square of Figure");
        return 0;
    }

    public void drawFigure(){

    }

    public void paintFigure(){

    }

    @Override
    public String toString() {
        return "Figure{" +
                "symbol=" + symbol +
                ", color=" + color +
                '}';
    }
}
