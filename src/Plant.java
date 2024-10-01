public abstract class Plant implements IPlantCare{

    //Inkapsling av variabler genom att sätta dem privata
    private String name;
    private double heightMeter;

    public Plant(String name, double heightMeter) {
        this.name = name;
        this.heightMeter = heightMeter;
    }

    public Plant(String name) {
        this.name = name;
    }

    //Publika metoder för att kunna komma åt de privata variablerna
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
