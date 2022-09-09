public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle('*', Color.RED, 7, 3);
        Triangle triangle1 = new Triangle('+', Color.YELLOW, 4, 8);
        Rectangle rectangle = new Rectangle('&', Color.BLUE, 2, 7);
        Rectangle rectangle1 = new Rectangle('/', Color.GRAY, 8, 5);
        Square square = new Square('#', Color.WHITE, 4);
        Square square1 = new Square('$', Color.GREEN, 5);
        square1.drawFigure(square1.getSymbol());
        square1.paintFigure(Color.BLUE);
        triangle.drawFigure(triangle.getSymbol());

        rectangle.figureArea();
        triangle.figureArea();
        square.figureArea();

        Figure figure = new Rectangle('§', Color.BLACK, 3, 6);
        figure.figureArea();
        figure.drawFigure(figure.getSymbol());

        Figure[] figures = new Figure[6];
        figures[0] = triangle;
        figures[1] = triangle1;
        figures[2] = rectangle;
        figures[3] = rectangle1;
        figures[4] = square;
        figures[5] = square1;

        for (Figure value : figures) {
            value.figureArea();
        }
    }
}
