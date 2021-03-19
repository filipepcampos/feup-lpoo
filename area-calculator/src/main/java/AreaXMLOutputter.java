public class AreaXMLOutputter {
    AreaAggregator aggregator;

    public AreaXMLOutputter(AreaAggregator aggregator){
        this.aggregator = aggregator;
    }

    public String output(){
        String output = String.format("<area>%f</area>", aggregator.sum());
        return output;
    }
}
