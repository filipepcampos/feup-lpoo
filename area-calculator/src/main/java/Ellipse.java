public class Ellipse extends Shape{
    double x_radius, y_radius;

    public Ellipse(double x_radius, double y_radius){
        this.x_radius = x_radius;
        this.y_radius = y_radius;
    }

    public double getX_radius() {
        return x_radius;
    }

    public double getY_radius() {
        return y_radius;
    }
}
