package products;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private boolean validationDate(String text){
        boolean val = false;
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            val = true;
        }
        return val;
    }
    public boolean getValidationDate(String text){return validationDate(text);}
}
