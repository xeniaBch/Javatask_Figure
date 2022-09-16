package Klassendiagram.Class;

public class ProductInMeters extends Article{

    private int width;
    private int length;

    public ProductInMeters(String name, double price, int width, int length) {
        super(name, price);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getEuroInventory(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "ProductInMeters{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public double getMetrInventory(){
        return 0.0;
    }
}
