package basicTemplates;
abstract class Parent {
    public Parent() {
        System.out.println("I am the constructor of Parent");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();

    abstract public void greet2();
}

class Child2 extends Parent {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Night");
    }
}

abstract class Child3 extends Parent {
    public void th() {
        System.out.println("I am feeling good");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        // Parent p = new Parent(); -- error
        Child2 c = new Child2();
        c.greet();
        c.greet2();
        // Child3 c3 = new Child3(); -- error
    }
}
