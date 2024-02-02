public class ElectricCars extends Cars {
    //Explaining the concept of inheritance, inheritance helps a child class to inherit properties(attributes) from the parent class
    //We can do this with the use of the "extends" key word and the "super" keyword
    private int batteryCapacity;
    private String model;
    public ElectricCars(String brand, int year,String model, int batteryCapacity){
        super(brand,year);
        this.batteryCapacity = batteryCapacity;
        this.model = model;
    }
/*
* Polymorphism: it allows us to access a single method in two different ways eg lets use the method start() and we will
* add another variable called model*/

    void start(boolean remoteStart){
        if(remoteStart){
            System.out.println("This is "+ this.brand +" car that can starts remotely");
        }
        else{
            start();
        }
    }
    public static void main(String[] args){
        ElectricCars myCar = new ElectricCars("Tesla",2022, "Model A",100);
        ElectricCars otherCar = new ElectricCars("Tesla", 2023,"Model S", 200);
        ElectricCars thisCar = new ElectricCars("Tesla", 2023,"Model S", 200);

        //printing output
        System.out.println("This is a "+ myCar.brand +" produced in "+ myCar.year +" with a battery Capacity of "+ myCar.batteryCapacity +" kwh");
        System.out.println("This is a "+ otherCar.brand +" produced in "+ otherCar.year + otherCar.model +" with a battery Capacity of "+ otherCar.batteryCapacity +" kwh");
        myCar.start();// can clear see here that we can access the methods of the parent class Cars
        otherCar.start(true);

        System.out.println(totalCars);

        thisCar.total();

       //total();
    }
}
