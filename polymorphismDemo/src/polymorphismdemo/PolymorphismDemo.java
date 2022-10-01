package polymorphismdemo;

public class PolymorphismDemo {

    public static void main(String[] args) {
        BaseLogger[] logger=new BaseLogger[]{new EmailLogger(),new FileLogger(), new DatabaseLogger(),new ConsoleLogger()};
        for (BaseLogger baseLogger : logger) {
            baseLogger.log("loglandı"); 
        }
        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }

}
