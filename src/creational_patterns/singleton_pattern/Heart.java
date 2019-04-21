package creational_patterns.singleton_pattern;

public class Heart {
    private String name = "Heart";

    private static Heart ourInstance = new Heart();

    public String getName() {
        return name;
    }

    public static Heart getInstance() {
        return ourInstance;
    }

    private Heart() {
    }
}
