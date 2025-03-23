public class Strawberry extends Fruit
{
    String taste = "sweets";
    String color = "red";

    public Strawberry()
    {
        super.price=40;
    }
    public Strawberry(String taste, String color)
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
