package Klassendiagram.Class;


public class ProductsInPieces extends Article{

    private int amount;
    private int length;

    public ProductsInPieces(String name, double price, int amount, int length) {
        super(name, price);
        this.amount = amount;
        this.length = length;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "ProductsinPieces{" +
                "amount=" + amount +
                ", length=" + length +
                '}';
    }

    @Override
    public double getEuroInventory() {
        return 0;
    }
}
