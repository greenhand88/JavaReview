package testJUC;
import java.lang.Thread;
import java.util.concurrent.Callable;

public class TestThread {
    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run(){

            }
        }).start();
    }
}
