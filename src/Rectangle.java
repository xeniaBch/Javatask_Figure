public class Rectangle extends Figure{

    int width;
    int height;

    public Rectangle(char symbol, Color color, int width, int height) {
        super(symbol, color);
        this.width = width;
        this.height = height;
    }


    @Override
    public void figureArea() {
        System.out.println("Square of rectangle is " + this.width*this.height);

    }

    @Override
    public void drawFigure(char a) {
        System.out.println("I draw rectangle with symbol " + a);
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(a + " ");
            }
                System.out.println();

        }
    }

    @Override
    public void paintFigure(Color color) {
        System.out.println( "I paint rectangle in " + color);
    }
}
