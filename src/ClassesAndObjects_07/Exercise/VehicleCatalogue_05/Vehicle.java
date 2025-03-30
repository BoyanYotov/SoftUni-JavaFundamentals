package ClassesAndObjects_07.Exercise.VehicleCatalogue_05;

public class Vehicle {
    private String type;
    private String model;
    private String colour;
    private int horsePower;

    public Vehicle(String type, String model, String colour, int horsePower){
        this.type = type;
        this.model = model;
        this.colour = colour;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type.substring(0,1).toUpperCase() + type.substring(1).toLowerCase();
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getHorsePower() {
        return horsePower;
    }
    }
