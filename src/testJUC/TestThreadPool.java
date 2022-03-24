package testJUC;
import java.util.concurrent.*;

/**
 * 线程池的使用
 */
public class TestThreadPool {
    public static void main(String[] args) {
        //不推荐,最大线程数为Integer.MAX_VALUE
        /*return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                                      60L, TimeUnit.SECONDS,
                                      new SynchronousQueue<Runnable>());
                                      */
        //详细看:https://www.cnblogs.com/pcheng/p/13540619.html
        //ExecutorService executorService = Executors.newCachedThreadPool();
        /*
        线程池一共七个参数
        一般填入的就以下这5个
        还有俩是ThreadFactory和handle
        */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20,
                60, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
    }
}
