package bai_tap.validatenameclass;

import thuc_hanh.validateaccount.ValidateAccount;

public class Test {
    private static ValidateNameClass accountExample;

    public static final String[] validAccount = new String[]{"C0318G"," M0318G"," P0323A"};

    public static void main(String args[]) {
        accountExample = new ValidateNameClass();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
    }
}
