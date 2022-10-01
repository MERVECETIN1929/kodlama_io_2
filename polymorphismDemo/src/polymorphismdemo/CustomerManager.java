package polymorphismdemo;

public class CustomerManager {
    BaseLogger baseLogger;
    public CustomerManager(BaseLogger baseLogger){
        this.baseLogger=baseLogger;
    }
    public void add(){
        System.out.println("müsteri eklendi");
        baseLogger.log("loglandı");
    }
}
