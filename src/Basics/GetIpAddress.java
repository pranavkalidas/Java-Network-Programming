package Basics;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

//Get IP Address from the domain name
public class GetIpAddress {
    public static void main(String[] args) throws IOException {
        InetAddress google = InetAddress.getByName("www.google.com");
        System.out.println(google);
        System.out.println("HOST ADDRESS: "+google.getHostAddress());
        System.out.println("CANONICAL HOST NAME: "+google.getCanonicalHostName());
        System.out.println("HOST NAME: "+google.getHostName());
        boolean reachable = google.isReachable(10000);
        System.out.println("IS REACHABLE: "+reachable);
    }
}
