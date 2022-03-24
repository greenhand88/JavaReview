package designModels;

public class LazySingleton {
    /**
     * 多线程安全的双重否定
     * 详细可以看    https://blog.csdn.net/justloveyou_/article/details/64127789
     * 懒汉式单例模式
     */
    private static volatile LazySingleton lazySingleton;
    private LazySingleton(){
    }
    public static LazySingleton getInstance(){
        if(lazySingleton ==null) {
            synchronized (LazySingleton.class){
                //仅在第一次创建时同步加锁
                if(lazySingleton ==null)
                    return new LazySingleton();
            }
        }
        return lazySingleton;
    }

}
