package polymorphismdemo;

public class EmailLogger extends BaseLogger {
     @Override
     public void log(String message){
        System.out.println("LOGGER TO EMAİL  : "+message);
    }
}
