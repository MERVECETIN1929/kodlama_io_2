package polymorphismdemo;

public class DatabaseLogger extends BaseLogger {
     @Override
     public void log(String message){
        System.out.println("LOGGER TO DATABASE  : "+message);
    }
}
