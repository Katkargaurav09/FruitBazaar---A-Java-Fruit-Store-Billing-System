public class Customer
{
    int id;
    long mobile;

    public Customer()
    { }
    public Customer(int id, long mobile)
    {
        this.id = id;
        this.mobile = mobile;
    }

    void displayCustomer()
    {
        System.out.println("/nCustomer Details : - /n");
        System.out.println("ID : " +  this.id);
        System.out.println("Mobile : " + this.mobile);
    }
}
