public class Triangle extends Figure {

    int base;
    int height;

    public Triangle(char symbol, Color color, int base, int height) {
        super(symbol, color);
        this.base = base;
        this.height = height;
    }


    @Override
    public void figureArea() {
        System.out.println("Square of triangle is " + (double) this.base * this.height / 2);

    }

    @Override
    public void drawFigure(char a) {
        System.out.println("I draw triangle with symbol " + a);
        for (int i = 1, j = 1; i <= this.height; i++, j += 2) {
            for (int space = this.height; space > i; space--)
                System.out.print(" ");
            for (int x = 1; x <= j; x++)
                System.out.print("*");
            System.out.println();
        }

    }

    @Override
    public void paintFigure(Color color) {
        System.out.println( "I paint triangle in " + color);
    }
}
