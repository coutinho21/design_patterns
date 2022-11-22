public class HumanClient implements Client{

    @Override
    public void happyHourStarted(Bar bar) {
        bar.endHappyHour();
    }

    @Override
    public void happyHourEnded(Bar bar) {
        bar.startHappyHour();
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        recipe.mix(drink);
        bar.startHappyHour();
        bar.addObserver(this);
        bar.endHappyHour();
    }
}
