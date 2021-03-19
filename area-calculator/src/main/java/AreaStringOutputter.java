public class AreaStringOutputter {
    SumProvider provider;

    public AreaStringOutputter(SumProvider provider){
        this.provider = provider;
    }

    public String output(){
        String output = String.format("Sum of areas: %f", provider.sum());
        return output;
    }
}
