package creational_patterns.singleton_pattern;

public class Brain {

    private String name = "Brain";

    private static Brain ourInstance = new Brain();

    public String getName() {
        return name;
    }

    public static Brain getInstance() {
        return ourInstance;
    }

    private Brain() {
    }
}
