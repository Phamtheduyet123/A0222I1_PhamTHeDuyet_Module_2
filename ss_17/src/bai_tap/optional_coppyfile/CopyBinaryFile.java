package bai_tap.optional_coppyfile;

import java.io.*;

public class CopyBinaryFile {
    private static final String source = "E:\\hello\\Student.abc";
    private static final String des = "E:\\hello\\result.abc";

    public static void main(String[] args) {
        try {
            System.out.println(copy());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private static long copy() throws IOException {
        InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(des);
        byte[] bytes = new byte[1024];
        int length;

        while ((length = inputStream.read(bytes)) > 0){
            outputStream.write(bytes);
        }

        inputStream.close();
        outputStream.close();
        File file= new File(des);
        return file.length();
    }
}
