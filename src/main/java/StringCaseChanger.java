public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder(drink.getText());

        for (int i = 0; i < stringBuilder.toString().length(); i++) {
            if(Character.isLowerCase(stringBuilder.charAt(i))){
                stringBuilder.setCharAt(i, Character.toUpperCase(drink.getText().charAt(i)));
            }
            else{
                stringBuilder.setCharAt(i, Character.toLowerCase(drink.getText().charAt(i)));
            }
        }

        drink.setText(stringBuilder.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
