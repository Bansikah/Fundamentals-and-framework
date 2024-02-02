public class CarObjects {
    public static void main(String[] args){

        //Creating objects
        Cars firstCar = new Cars("Toyota", 2012);
        Cars secondCar = new Cars("BMW", 2015);

        //Printing objects
        System.out.println(secondCar.brand);
        System.out.println(firstCar.year);

        //Calling methods
        firstCar.start();
        secondCar.brake();
    }
}
