package products;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private boolean validationDate(String text){
        boolean val = false;
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}$");
        Matcher matcher = pattern.matcher(text);
        String[] textSplit = text.split("-");
        if (textSplit.length<=1){return false;}
        int month = Integer.parseInt(textSplit[1]);
        int year = Integer.parseInt(textSplit[0]);
        int days = Integer.parseInt(textSplit[2]);
        if (matcher.find() && month <= 12 && month > 0 && days <=31 && days >0 && year >1970){
            val = true;
        }
        return val;
    }
    public boolean getValidationDate(String text){return validationDate(text);}
}
