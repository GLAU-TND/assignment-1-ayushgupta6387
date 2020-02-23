package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheck {

    public boolean isEmailCorrect(String emailAddress) {
        String correctEmail = "[a-zA-Z][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern patternEmail = Pattern.compile(correctEmail);
        Matcher matcherEmail = patternEmail.matcher(emailAddress);
        return matcherEmail.matches();
    }
}

