package bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX ="\\(\\d{2}\\)-\\(0\\d{9}\\)";

    public ValidatePhoneNumber() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
