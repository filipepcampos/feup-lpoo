public class SmartStrategy implements OrderingStrategy{
    StringDrink drink;
    StringRecipe recipe;
    boolean pending = false;

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.drink = drink;
        this.recipe = recipe;
        if(bar.isHappyHour()){
            bar.order(drink, recipe);
        } else{
            pending = true;
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        if(pending){
            pending = false;
            bar.order(drink, recipe);
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
