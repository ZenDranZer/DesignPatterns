package structural_pattern.adaptor_pattern;

public class CharacterAdaptor implements DrawOInterface,DrawXInterface {

    DrawX drawX;
    DrawO drawO;

    public CharacterAdaptor(DrawX drawX) {
        this.drawX = drawX;
    }

    public CharacterAdaptor(DrawO drawO) {
        this.drawO = drawO;
    }

    @Override
    public void drawCharacterO() {
        System.out.println("Adapted O to X :");
        drawX.drawCharacterX();
    }

    @Override
    public void drawCharacterX() {
        System.out.println("Adapted X to O :");
        drawO.drawCharacterO();
    }
}
