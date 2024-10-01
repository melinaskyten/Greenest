public class Palm extends Plant{

    //Inkapsling av variabler genom att sätta dem privata
    private final LiquidType liquidType = LiquidType.KRANVATTEN;
    private final double liquidPerMeter = 0.5;

    public Palm(String name, double heightMeter) {
        super(name, heightMeter);
    }

    @Override
    public double getLiquidAmount() {
        return getHeightMeter() * liquidPerMeter;
    }

    @Override
    public LiquidType getLiquidType() {
        return liquidType;
    }
}
