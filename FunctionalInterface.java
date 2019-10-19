
public class FunctionalInterface {
    public static void main(String[] args) {
        Greeting greetingg = (name) -> {
            System.out.println("Hello " + name);

        };
        greetingg.greet("FAIZAH");
    }

    }
@java.lang.FunctionalInterface
interface Greeting {
    void greet (String name);
}
