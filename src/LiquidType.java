public enum LiquidType {
    KRANVATTEN ("Kranvatten"),
    MINERALVATTEN ("Mineralvatten"),
    PROTEINDRYCK ("Proteindryck");

    public final String lowercase;

    LiquidType(String liquidType) {
        lowercase = liquidType;
    }
}
