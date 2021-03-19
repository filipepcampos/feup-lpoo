public class House implements hasArea{
    double area;

    public House(double area){
        this.area = area;
    }

    @Override
    public double getArea(){
        return this.area;
    }
}
