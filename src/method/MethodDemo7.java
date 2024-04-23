package method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class MethodDemo7 {
    public static String numbering(int init, int end) {
        int i= init;
        String output="";
        while(i<=end){
            output+=i;
            i++;
        }
        return output;
    }

    public static void main(String[] args) {
        String result=numbering(1,10);
        System.out.println(result);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.close();
        }catch (IOException e){}
    }
}
