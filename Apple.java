public class Apple extends Fruit
{
    String taste;
    String color;

    public Apple()
    {
        super.price=50;
    }
    public Apple(int qty)
    {
        this();
        this.qty = qty;
        this.taste = "sweet";
        this.color = "red";
    }

    public void displayFruit()
    {
        System.out.println("The Apple Fruit is Selected :- ");
        super.displayFruit();
        System.out.println("Taste : " + this.taste);
        System.out.println("Color : " + this.color);
    }
}
