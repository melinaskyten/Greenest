public abstract class Plant implements IPlantCare{

    //Inkapsling
    private String name;
    private double heightMeter;

    public Plant(String name, double heightMeter) {
        this.name = name;
        this.heightMeter = heightMeter;
    }

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeightMeter() {
        return heightMeter;
    }

    public void setHeightMeter(Double heightMeter) {
        this.heightMeter = heightMeter;
    }
}
