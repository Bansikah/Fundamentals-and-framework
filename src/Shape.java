public interface Shape {

    double PI = 3.14;
    void draw();

    default double areaOfCircle(double radius){
        return  PI * (Math.pow(radius, 2));
    }

}
