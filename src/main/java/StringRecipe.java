import java.util.List;

public class StringRecipe {
    private final List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers){
        this.transformers = transformers;
    }

    public void mix(StringDrink drink){
        for (StringTransformer current : transformers) {
            current.execute(drink);
        }
    }

}
