package structural_pattern.adaptor_pattern;

public class Driver {
    public static void main(String[] args) {
        DrawO drawO = new DrawO();
        DrawX drawX = new DrawX();

        drawO.drawCharacterO();
        CharacterAdaptor adaptor = new CharacterAdaptor(drawO);
        adaptor.drawCharacterX();

        drawX.drawCharacterX();
        adaptor = new CharacterAdaptor(drawX);
        adaptor.drawCharacterO();
    }
}
