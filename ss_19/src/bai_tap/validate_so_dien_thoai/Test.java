package bai_tap.validate_so_dien_thoai;

import bai_tap.validatenameclass.ValidateNameClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static ValidatePhoneNumber accountExample;

    public static final String[] validAccount = new String[]{"(84)"," (a8)-(22222222)"};

    public static void main(String args[]) {
//        accountExample = new ValidatePhoneNumber();
//        for (String account : validAccount) {
//            boolean isvalid = accountExample.validate(account);
//            System.out.println("Account is " + account + " is valid: " + isvalid);
//        }


        // regex (xx)-(0xxxxxxxxx)
        String regex= "\\(\\d{2}\\)-\\(0\\d{9}\\)";
        String phone= "(84)-(0123456789)";
        System.out.println(phone+ " is "+ phone.matches(regex));
    }
}
