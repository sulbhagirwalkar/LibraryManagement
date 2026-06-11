package Library.Management.LibraryManagement.entity;

public class SingletonDemo {
    private SingletonDemo sigletonDemo = new SingletonDemo();
    private SingletonDemo(){}
    public static SingletonDemo getInstance(){
        return getInstance().sigletonDemo;
    }
    public static void main(String[] args) {

    }
}
