public class Customer implements waiter{

    protected int Cust_id;
    protected String Name;
  

    public Customer(int Cust_id){
        this.Cust_id=Cust_id;
    }
    public Customer(int Cust_id,String Name)
    {
        this.Cust_id=Cust_id;
        this.Name=Name;
    }
    public int getCustId()
    {
        return Cust_id;
    }
    public String getName()
    {
        return Name;
    
    }
    public String toString(){
        return ("cust_info " +Cust_id+ ", " +Name);
    }
}