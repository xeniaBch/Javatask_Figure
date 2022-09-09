public class Square extends Figure{

    int side;


    public Square(char symbol, Color color, int side) {
        super(symbol, color);
        this.side = side;
    }


    @Override
    public void figureArea() {
        System.out.println("Square of square is " + this.side*this.side);

    }
    @Override
    public void drawFigure(char a) {
        System.out.println("I draw square with symbol " + a);
        for (int i = 0; i < this.side; i++) {
            for (int j = 0; j < this.side; j++) {
                System.out.print(a + " ");
            }
            System.out.println();

        }
    }

    @Override
    public void paintFigure(Color color) {
        System.out.println( "I paint square in " + color);
    }
}
