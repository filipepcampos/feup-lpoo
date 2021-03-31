public class MargueritaCertifier extends PizzaCertifier {
    @Override
    Pizza makeSamplePizza() {
        Recipe recipe = new MargueritaRecipe();
        return recipe.makeMediumPizza();
    }
}