package structural_pattern.adaptor_pattern;

public class DrawX implements DrawXInterface{

    private final String character = "X";

    @Override
    public void drawCharacterX(){
        System.out.println("In DrawX : drawing : " + character);
    }
}
