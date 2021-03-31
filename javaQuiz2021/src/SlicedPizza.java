import java.util.List;

public class SlicedPizza implements Pizza {
    Pizza pizza;
    int slices;

    public SlicedPizza(Pizza pizza, int slices) {
        this.pizza = pizza;
        this.slices = slices;
    }

    @Override
    public boolean addIngredient(Ingredient ingredient) {
        return pizza.addIngredient(ingredient);
    }

    @Override
    public int getIngredientCount() {
        return pizza.getIngredientCount();
    }

    @Override
    public List<Ingredient> getIngredients() {
        return pizza.getIngredients();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 2.0;
    }

    @Override
    public void setPrice(double v) {
        pizza.setPrice(v);
    }

    public int getSlices() {
        return slices;
    }
}