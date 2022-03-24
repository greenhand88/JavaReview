package designModels;

public class Prototype {
    /**
     * 原型模式:深拷贝
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype a=new Realizetype();
        Realizetype b=a.clone();
        System.out.println("a:"+a.hashCode());
        System.out.println("b:"+b.hashCode());
    }
}
class Realizetype implements Cloneable {
    Realizetype() {
        System.out.println("具体原型创建成功！");
    }
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}