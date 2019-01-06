package chapter_2_eclipse;

public class GreeterImpl implements Greeter {

    @Override
    public String greet() {
        return "Hello World";
    }

    @Override
    public String greet(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {
        Greeter greeter = new GreeterImpl();
        System.out.println(greeter.greet());
        System.out.println(greeter.greet("Michael"));
    }
}
