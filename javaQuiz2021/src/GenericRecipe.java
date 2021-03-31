import java.util.List;

public class GenericRecipe extends Recipe {
    List<Ingredient> ingredients;

    public GenericRecipe(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public Pizza makeMediumPizza() {
        Pizza p = new MediumPizza();
        for(Ingredient ig : ingredients){
            p.addIngredient(ig);
        }
        return p;
    }
}