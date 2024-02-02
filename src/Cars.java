public class Cars {

    protected String brand;
    int year;

    static int totalCars;

    //Creating a constructor for the class Cars
    public Cars(String brand, int year){
        this.brand = brand;
        this.year = year;
        totalCars ++;
    }
    //creating methods for the class Cars
    void start(){
        System.out.println("Starting the car" + this.brand);
    }
    void accelerate(){
        System.out.println("Accelerating.."+ this.brand);
    }
    void brake(){
        System.out.println("Car is braking.."+ this.brand);
    }

    static void total(){
        System.out.println(totalCars + 1);
    }
    //Encapsulation and access modifiers, encapsulation brings about abstraction(hiding code somewhere) ,
    //Access modifiers helps us to manage how our classes and methods can be accessed(types:+public,-private,#protected, package-private)
}
