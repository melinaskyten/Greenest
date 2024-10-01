public class Succulent extends Plant {

    //Inkapsling
    private final LiquidType liquidType = LiquidType.MINERALVATTEN;
    private final double liquidAmount = 0.02;

    public Succulent(String name){
        super(name);
    }

    @Override
    public double getLiquidAmount(){
        return liquidAmount;
    }

    @Override
    public LiquidType getLiquidType(){
        return liquidType;
    }

}
