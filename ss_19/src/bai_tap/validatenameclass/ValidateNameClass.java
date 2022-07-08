package bai_tap.validatenameclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^[C|A|P]\\d{4}[G|H|I|K|L|M]$";

    public ValidateNameClass() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return ((Matcher) matcher).matches();
    }
}
