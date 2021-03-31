public class StringReplacer implements StringTransformer{
    char oldChar;
    char newChar;

    StringReplacer(char oldChar, char newChar){
        this.oldChar = oldChar;
        this.newChar = newChar;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(oldChar, newChar));
    }
}
