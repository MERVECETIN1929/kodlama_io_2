package polymorphismdemo;

public class FileLogger  extends BaseLogger{
     @Override
     public void log(String message){
        System.out.println("LOGGER TO FİLE  : "+message);
    }
}
