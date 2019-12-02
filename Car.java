import java.text.*;

public class Car{
  private String make;
  private String model;
  private double mpg;
  private double fuelAmount;
  private double tankSize;


//default constructor
public Car()
make = "";
model = "";
mpg = "";

// making the car(custom constructor)
  public Car (String carMake, String carModel, double carmpg, double carTankSize){
    make = carMake;
    model = carModel;
    mpg = carmpg;
    tankSize= carTankSize;
    fuelAmount = carTankSize;

  }
// what a car does
public void drive (double distance){
  double gasUsed = distance/getmpg();
  setFuelAmount(getFuelAmount() - gasUsed);
}

public void addFuel (double carFuel){
   setFuelAmount(getFuelAmount() + carFuel);
}

public double getmpg(){
  return mpg;
}

public String getMake(){
  return make;
}

public String getModel(){
  return model;
}

public double getFuelAmount(){
  return fuelAmount;
}

public double getTankSize(){
  return tankSize;
}

public void setFuelAmount(double gasolina){
  fuelAmount = gasolina;
}



// current state of car
public String toString(){
  DecimalFormat fmt= new DecimalFormat(".##");
  String result = "Make: " + getMake() + "\n";
  result += "Model: " + getModel() + "\n";
  result += "mpg: " + getmpg() + "\n";
  result += "Fuel Amount: " + fmt.format(getFuelAmount()) + " gallons" + "\n";
  result += "Tank Size: " + getTankSize() + " gallons";
  return result;

  }
}
