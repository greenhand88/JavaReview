package designModels;

public class HungrySingleton {
    /**
     * 饿汉式单例模式
     */
    private static HungrySingleton hungrySingleton =new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
