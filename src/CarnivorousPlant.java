public class CarnivorousPlant extends Plant{

    //Inkapsling av variabler genom att sätta dem privata
    private final LiquidType liquidType = LiquidType.PROTEINDRYCK;
    private final double liquidBaseLevel = 0.1;
    private final double liquidPerMeter = 0.2;

    public CarnivorousPlant(String name, double heightMeter){
        super(name, heightMeter);
    }

    @Override
    public double getLiquidAmount(){
        return liquidBaseLevel + (liquidPerMeter * getHeightMeter());
    }

    @Override
    public LiquidType getLiquidType(){
        return liquidType;
    }
}
