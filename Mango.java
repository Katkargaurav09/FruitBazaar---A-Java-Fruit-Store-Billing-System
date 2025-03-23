public class Mango extends Fruit
{
    String taste = "sweets";
    String color = "yellow";

    public Mango()
    {
        super.price=80;
    }
    public Mango(String taste, String color)
    {
        this();
        this.taste = taste;
        this.color = color;
    }

    public void displayFruit()
    {
        super.displayFruit();
        System.out.println("Taste : " + this.taste);
        System.out.println("Color : " + this.color);
    }
}
