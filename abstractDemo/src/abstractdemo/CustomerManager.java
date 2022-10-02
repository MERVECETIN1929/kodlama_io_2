package abstractdemo;

public class CustomerManager {
    BaseDatabaseManager databaseManager;
    public CustomerManager(BaseDatabaseManager baseDatabaseManager){
        this.databaseManager=baseDatabaseManager;
    }
    public void getCustomers() {
        databaseManager.getData();
    }
}
