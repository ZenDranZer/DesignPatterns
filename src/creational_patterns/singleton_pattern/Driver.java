package creational_patterns.singleton_pattern;

public class Driver {
    public static void main(String[] args) {
        System.out.println(Brain.getInstance().getName());
        System.out.println(Heart.getInstance().getName());
    }
}
