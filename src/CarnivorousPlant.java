public class CarnivorousPlant extends Plant{

    //Inkapsling
    private final LiquidType liquidType = LiquidType.PROTEINDRYCK;

    public CarnivorousPlant(String name, double heightMeter){
        super(name, heightMeter);
    }

    @Override
    public double getLiquidAmount(){
        return 0.1 + (0.2 * getHeightMeter());
    }

    @Override
    public LiquidType getLiquidType(){
        return liquidType;
    }
}
