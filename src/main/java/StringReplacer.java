public class StringReplacer implements StringTransformer{
    char toBeReplaced, toReplace;

    StringReplacer(char str1, char str2){
        this.toBeReplaced = str1;
        this.toReplace = str2;
    }
    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(this.toBeReplaced,this.toReplace));
    }

    @Override
    public void undo(StringDrink drink) {
        drink.setText(drink.getText().replace(this.toReplace,this.toBeReplaced));
    }
}
