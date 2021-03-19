public class AreaStringOutputter {
    AreaAggregator aggregator;

    public AreaStringOutputter(AreaAggregator aggregator){
        this.aggregator = aggregator;
    }

    public String output(){
        String output = String.format("%f", aggregator.sum());
        return output;
    }
}
