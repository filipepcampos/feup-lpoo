public class MargueritaRecipe extends Recipe {
    @Override
    public Pizza makeMediumPizza() {
        Pizza p = new MediumPizza();
        p.addIngredient(new Ingredient("Basil"));
        p.addIngredient(new Ingredient("Tomato"));
        p.addIngredient(new Ingredient("Mozzarella"));
        return p;
    }
}
