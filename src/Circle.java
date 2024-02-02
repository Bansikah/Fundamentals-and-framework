public class Circle implements Shape{
    private double raduis;

    public Circle(double raduis){
        this.raduis = raduis;
    }

    public void draw(){
        System.out.println("Drawing a circle of raduis "+ raduis);
    }
    public static void main(String[] args){
        Circle circle1 = new Circle(2);

        circle1.draw();

        double area = circle1.areaOfCircle(circle1.raduis);
        System.out.println(area);
    }
}
