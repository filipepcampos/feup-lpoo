public class Application {
    public static void main(String[] args) {
        AreaAggregator aagreg = new AreaAggregator();
        aagreg.addShape(new Circle(5.2));
        aagreg.addShape(new Square(2));
        aagreg.addShape(new Square(7.82));
        System.out.println(aagreg.sum());
    }
}
