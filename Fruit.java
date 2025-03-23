public class Fruit
{
    int price;
    int qty;

    public Fruit()
    { }
    public Fruit(int price, int qty)
    {
        this.price = price;
        this.qty = qty;
    }

    void displayFruit()
    {
        System.out.println("--------Displaying Fruit Details : --------");
        System.out.println("Price : " + this.price + " per kg");
        System.out.println("Quantity : " + this.qty + " kg");
    }
}