import java.util.Scanner;
public class Bill{
    String Name;
    
    int billID;
    int Cost;
    
    void getBill(){
        Scanner in = new Scanner(System.in);

        System.out.println("Customer name: ");
        String Name = in.nextLine();


        System.out.println("Bill ID: ");
        int billID = in.nextInt();

        System.out.println("Total payment made by Customer: ");
        int Cost = in.nextInt();  
        System.out.println("----------DATA INSERTED SUCCESSFULLY-------- ");      
    }
}
