public class Line implements Shape{
    double length;

    public Line(double length){
        this.length = length;
    }

    public double getArea() throws NoAreaException {
        throw new NoAreaException();
    }
}
