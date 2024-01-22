package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class BufferedReaderClass {
    public static void main(String[] args) throws IOException {
        try{
            URL url = new URL("https://www.quora.com");
            URLConnection myUrlConnection = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(myUrlConnection.getInputStream()));
            while(br.readLine() != null){
                System.out.println(br.readLine());
                System.out.println("Printed");
            }
        }
        catch (IOException exception){
            System.out.println(exception);
        }

    }
}
