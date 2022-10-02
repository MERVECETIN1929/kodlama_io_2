package abstractdemo;

public class AbstractDemo {

    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new MySqlDatabaseManager());
        
        customerManager.getCustomers();
    }

}
