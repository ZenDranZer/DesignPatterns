package structural_pattern.adaptor_pattern;

public class DrawO implements DrawOInterface {
    private final String character = "O";

    @Override
    public void drawCharacterO(){
        System.out.println("In DrawO : drawing : " + character);
    }
}
