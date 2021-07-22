package vn.plusplus.Exception;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Checked {
    public static void main(String[] args) {
        //String content = Files.readAllBytes(new File("C:\\Users\\Administrator\\Desktop\\diemkhang\\test reader\\introduce.txt").toPath());
        // Fix exception
        byte[] content = null;
        try {
            content = Files.readAllBytes(new File("C:\\Users\\Administrator\\Desktop\\diemkhang\\test reader\\introduce.txt").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(content));
    }
}
