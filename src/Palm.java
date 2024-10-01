public class Palm extends Plant{

    //Inkapsling
    private final LiquidType liquidType = LiquidType.KRANVATTEN;

    public Palm(String name, double heightMeter) {
        super(name, heightMeter);
    }

    //Metod som
    @Override
    public double getLiquidAmount() {
        return getHeightMeter() * 0.5;
    }

    @Override
    public LiquidType getLiquidType() {
        return liquidType;
    }
}
