public class HumanClient implements Client{
    OrderingStrategy strategy;

    public HumanClient(OrderingStrategy strategy){
        this.strategy = strategy;
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.strategy.wants(drink, recipe, bar);
    }

    @Override
    public void happyHourStarted(Bar bar) {
        this.strategy.happyHourStarted((StringBar) bar); // TODO: this is stupid
    }

    @Override
    public void happyHourEnded(Bar bar) {
        this.strategy.happyHourEnded((StringBar) bar); // TODO: this is stupid
    }
}
