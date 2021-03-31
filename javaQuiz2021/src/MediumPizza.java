import java.util.ArrayList;
import java.util.List;

public class MediumPizza implements Pizza {
    List<Ingredient> ingredientList;
    double price;

    MediumPizza(){
        this.ingredientList = new ArrayList<>();
        this.price = 0.0;
    }

    @Override
    public boolean addIngredient(Ingredient ingredient) {
        if(ingredientList.contains(ingredient)){
            return false;
        }
        ingredientList.add(ingredient);
        return true;
    }

    @Override
    public int getIngredientCount(){
        return ingredientList.size();
    }

    @Override
    public List<Ingredient> getIngredients() {
        return this.ingredientList;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double v) {
        this.price = v;
    }
}