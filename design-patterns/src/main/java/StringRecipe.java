import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformers;

    StringRecipe(List<StringTransformer> transformers){
        this.transformers = transformers;
    }

    void mix(StringDrink drink){
        for(StringTransformer transformer : transformers){
            transformer.execute(drink);
        }
    }
}
