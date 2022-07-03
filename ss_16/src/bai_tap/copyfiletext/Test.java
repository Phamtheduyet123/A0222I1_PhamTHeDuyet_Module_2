package bai_tap.copyfiletext;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String source = "E:\\hello\\abcddddddd.txt";
        String des = "E:\\hello\\result.txt";
        CoppyFileText text = new CoppyFileText();
        text.coppyFile(source,des);
    }
}
