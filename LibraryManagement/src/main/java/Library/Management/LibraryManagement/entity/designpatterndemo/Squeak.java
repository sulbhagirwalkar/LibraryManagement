package Library.Management.LibraryManagement.entity.designpatterndemo;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak squeak!");
    }
}
