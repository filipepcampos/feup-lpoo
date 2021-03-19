public class AreaXMLOutputter {
    SumProvider provider;

    public AreaXMLOutputter(SumProvider provider){
        this.provider = provider;
    }

    public String output(){
        String output = String.format("<area>%f</area>", provider.sum());
        return output;
    }
}
