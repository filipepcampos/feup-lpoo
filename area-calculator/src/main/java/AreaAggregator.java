import java.util.ArrayList;
import java.util.List;

public class AreaAggregator {
    private List<hasArea> objs = new ArrayList<>();

    public void add(hasArea shape) {
        objs.add(shape);
    }

    public double sum() {
        double sum = 0;
        for (hasArea obj: objs) {
            sum += obj.getArea();
        }
        return sum;
    }
}