import java.util.List;

public abstract class PizzaCertifier {
    public boolean isCertified(Pizza pizza1) {
        List<Ingredient> necessary = makeSamplePizza().getIngredients();
        List<Ingredient> pizzaIng = pizza1.getIngredients();
        if (pizzaIng.size() != necessary.size()) {
            return false;
        }
        for (Ingredient ig : necessary) {
            if(!pizzaIng.contains(ig)){
                return false;
            }
        }
        return true;
    }

    abstract Pizza makeSamplePizza();
}
