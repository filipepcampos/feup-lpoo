public class Application {
    public static void main(String[] args) {
        AreaAggregator aggregator = new AreaAggregator();
        aggregator.add(new Circle(5.2));
        aggregator.add(new Square(2));
        aggregator.add(new Square(7.82));
        aggregator.add(new Triangle(10.2, 5.8));
        aggregator.add(new House(52.7));
        AreaStringOutputter stringOutputter = new AreaStringOutputter(aggregator);
        AreaXMLOutputter xmlOutputter = new AreaXMLOutputter(aggregator);

        System.out.println(stringOutputter.output());
        System.out.println(xmlOutputter.output());

    }
}
