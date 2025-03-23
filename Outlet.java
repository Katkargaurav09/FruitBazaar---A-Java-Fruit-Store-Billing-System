public class Outlet
{
    Customer customer;
    Fruit fruit;

    public Outlet()
    { }
    public Outlet(Customer customer, Fruit fruit)
    {
        this.customer = customer;
        this.fruit = fruit;
    }

    public void displayCart()
    {
        if (this.fruit instanceof Apple)
        {
            Apple apple = (Apple) this.fruit;
            apple.displayFruit();
        }
        else if(this.fruit instanceof Strawberry)
        {
            Strawberry strawberry = (Strawberry) this.fruit;
            strawberry.displayFruit();
        }
        else if(this.fruit instanceof Mango)
        {
            Mango mango = (Mango) this.fruit;
            mango.displayFruit();
        }
    }

    public int billGenerator()
    {
        int totalBill = 0;

        if (this.fruit instanceof Apple)
        {
            Apple apple = (Apple) this.fruit;
            System.out.println("------The Bill Is Generating : ------");
            totalBill = apple.price * apple.qty;
        }
        else if(this.fruit instanceof Strawberry)
        {
            Strawberry strawberry = (Strawberry) this.fruit;
            System.out.println("------The Bill Is Generating : ------");
            totalBill = strawberry.price * strawberry.qty;
        }
        else if(this.fruit instanceof Mango)
        {
            Mango mango = (Mango) this.fruit;
            System.out.println("------The Bill Is Generating : ------");
            totalBill = mango.price * mango.qty;
        }

        return totalBill;
    }
}
