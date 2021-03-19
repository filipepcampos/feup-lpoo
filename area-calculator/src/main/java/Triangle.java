public class Triangle implements Shape{
    double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * base/2;
    }
}