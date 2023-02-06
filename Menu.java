public class Menu implements waiter{
    String Name;
    String Address;
    String Menu;

    public Menu(String Name, String Address, String Menu){
        this.Name = Name;
        this.Address = Address;
        this.Menu = Menu;
    }

    public String getMenu(){
        System.out.println("------------------PLEASE CHOOSE ABOVE MENU-----------------");
        System.out.println("ITEM\t\t\t\tPRICE");
        System.out.println("1. chinese rice\t\t\t\t1000");
        System.out.println("2. pilau\t\t\t\t2000");
        System.out.println("3. Mandi\t\t\t\t5000");
        System.out.println("4. kunife juice\t\t\t\t500");
        System.out.println("5. Fried potato\t\t\t2500");
        System.out.println("6. Sea foods\t\t\t\t6000");
        System.out.println("7. biriani\t\t\t\t3500");
        System.out.println("8. juis\t\t\t\t\t1000");
        System.out.println("9. Fruits\t\t\t\t4000");
        return Menu;
    }

    public String getAddress(){
       
        return Address;
    }

    public String getName(){
        System.out.println("\t\tWELCOME DEAR CUSTOMER");
        System.out.println("\t\tLET ME BE YOUR WAITER FOR TODAY");
        return Name;
    }

}
