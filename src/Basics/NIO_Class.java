package Basics;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NIO_Class {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress google = InetAddress.getByName("www.google.com");
        FileChannel fileChannel;    //File
        DatagramChannel datagramChannel;    //UDP
        SocketChannel socketChannel;    //TCP
        ServerSocketChannel serverSocketChannel;    //TCP

    }
}
