package Model;
import Enum.Color;
import Interface.Artist;
import Interface.Painter;

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

    public void figureArea(){
        System.out.println("Calculate Square of Figure");
    }

    public void drawFigure(){

    }

    public void paintFigure(){

    }

}
