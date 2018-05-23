// abstractclass.java
public abstract class AbstractClass{
    public void randomMethod(){
        System.out.println("This is a random method that is implemented in this class");
    }
    public abstract void abstractMethod();
}

// SubClassOne.java
public class SubClassOne extends AbstractCLass{
    // we must implement the abstract method otherwise we will get an error.
    public void abstractMethod(){
        System.out.println("THis is our method from subclass one");
    }
}

// SubClassTwo.java
public class SubClassTwo extends AbstractClass{
    public void abstractMethod(){
        System.out.println("This is our method from subclass two");
    }
}

// InterfaceDemo.java
public interface InterFaceDemo{
    void methodOne();
    void methodTwo();
}

// AbstractDemo.java
public abstract class AbstractDemo implements InterfaceDemo{
    public void methodOne(){
        System.out.println("Hello from the abstract demo");
    }
}

// Class Demo
public class ClassDemo extends AbstractDemo{
    public void methodTwo(){
        System.out.println("class");
    }
}

// AbstractTester
class AbstractTester {
    public static void main(String[] args) {
        ClassDemo c = new ClassDemo();
        c.methodOne();
        c.methodTwo();
    }
}