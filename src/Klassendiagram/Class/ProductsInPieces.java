package Klassendiagram.Class;


public class ProductsInPieces extends Article{

    private int amount;


    public ProductsInPieces(String name, double price, int amount) {
        super(name, price);
        this.amount = amount;

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }



    @Override
    public String toString() {
        return '{' + getName() +
                " amount=" + amount +
                ", price=" + getPrice() +
                " sum to pay = " + getEuroInventory() +
                '}'+ '\n';
    }

    @Override
    public double getEuroInventory() {
        return amount*getPrice();
    }

    @Override
    public int compareTo(Article article) {
        if(getEuroInventory() > article.getEuroInventory()) {
            return 1;
        } else if (getEuroInventory() < article.getEuroInventory()) {
            return -1;
        }
        return 0;
    }
}
