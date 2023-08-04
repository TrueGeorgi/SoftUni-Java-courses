package robotService.entities.supplements;

public class MetalArmor extends BaseSupplement {

    private static final int HARDNESS_CONSTANT = 5;
    private static final double PRICE_CONSTANT = 15;

    public MetalArmor() {
        super(HARDNESS_CONSTANT, PRICE_CONSTANT);
    }

}
