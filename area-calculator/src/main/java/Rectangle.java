public class Rectangle implements AreaShape {
    double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
